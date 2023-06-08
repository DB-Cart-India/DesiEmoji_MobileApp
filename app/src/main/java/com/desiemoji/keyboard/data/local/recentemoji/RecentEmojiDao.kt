package com.desiemoji.keyboard.data.local.recentemoji

import androidx.room.*
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface RecentEmojiDao {

    @Query("SELECT DISTINCT(${RecentEmojiAttr.ATTR_EMOJI_CODE}) FROM ${RecentEmojiAttr.TABLE_NAME} ORDER BY ${RecentEmojiAttr.ATTR_TABLE_ID} DESC")
    fun getAllRecentEmojis() : Single<List<String>>

    @Query("SELECT * FROM ${RecentEmojiAttr.TABLE_NAME} WHERE ${RecentEmojiAttr.ATTR_EMOJI_CODE} = :code")
    fun getRecentEmojisByKeyword(code: String) : Single<List<RecentEmojiEntity>>

    @Insert
    fun insert(emoji: RecentEmojiEntity) : Completable

    @Insert
    fun insert(emoji: List<RecentEmojiEntity>) : Completable

    @Update
    fun update(emoji: RecentEmojiEntity) : Completable

    @Delete
    fun delete(emoji: RecentEmojiEntity) : Completable

    @Query("DELETE FROM ${RecentEmojiAttr.TABLE_NAME} WHERE ${RecentEmojiAttr.ATTR_TABLE_ID} in (:idList)")
    fun delete(idList: List<Int>): Completable

    @Query("DELETE FROM ${RecentEmojiAttr.TABLE_NAME}")
    fun nukeData(): Completable




}