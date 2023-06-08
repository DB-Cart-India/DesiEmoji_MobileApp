package com.desiemoji.keyboard.data.local.emoji

import androidx.room.*
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface EmojiDao {

    @Query("SELECT * FROM ${EmojiAttr.TABLE_NAME} WHERE ${EmojiAttr.ATTR_ACTIVE} = true")
    fun getAllEmoji() : Single<List<EmojiEntity>>

    @Query("SELECT * FROM ${EmojiAttr.TABLE_NAME} WHERE ${EmojiAttr.ATTR_SUBCATEGORY_ID} = :subCategoryId AND ${EmojiAttr.ATTR_ACTIVE} = true")
    fun getEmojiBySubCategoryId(subCategoryId: Long) : Single<List<EmojiEntity>>

    @Query("SELECT * FROM ${EmojiAttr.TABLE_NAME} WHERE ${EmojiAttr.ATTR_CATEGORY_ID} = :categoryId AND ${EmojiAttr.ATTR_ACTIVE} = true ORDER BY ${EmojiAttr.ATTR_SUBCATEGORY_ID} ASC")
    fun getEmojiByCategoryId(categoryId: Long) : Single<List<EmojiEntity>>

    @Query("SELECT * FROM ${EmojiAttr.TABLE_NAME} WHERE ${EmojiAttr.ATTR_EMOJI_ID} = :emojiId")
    fun getEmojiByEmojiId(emojiId: Long) : Single<EmojiEntity>

    @Query("SELECT * FROM ${EmojiAttr.TABLE_NAME} WHERE (${EmojiAttr.ATTR_EMOJI_KEYWORD} LIKE '%' || :searchText || '%') AND ${EmojiAttr.ATTR_ACTIVE} = true")
    fun getEmojiBySearch(searchText: String) : Single<List<EmojiEntity>>

    @Insert
    fun insert(data: EmojiEntity) : Completable

    @Insert
    fun insert(data: List<EmojiEntity>) : Completable

    @Update
    fun update(data: EmojiEntity) : Completable

    @Delete
    fun delete(data: EmojiEntity) : Completable

    @Query("DELETE FROM ${EmojiAttr.TABLE_NAME} WHERE ${EmojiAttr.ATTR_TABLE_ID} in (:idList)")
    fun delete(idList: List<Int>): Completable

    @Query("DELETE FROM ${EmojiAttr.TABLE_NAME}")
    fun nukeData(): Completable

}