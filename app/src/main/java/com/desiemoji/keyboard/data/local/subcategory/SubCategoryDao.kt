package com.desiemoji.keyboard.data.local.subcategory

import androidx.room.*
import com.desiemoji.keyboard.data.local.emoji.EmojiAttr
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface SubCategoryDao {

    @Query("SELECT * FROM ${SubCategoryAttr.TABLE_NAME} WHERE ${SubCategoryAttr.ATTR_ACTIVE} = true  ORDER BY ${SubCategoryAttr.ATTR_SUBCATEGORY_NAME} ASC")
    fun getAllSubCategory() : Single<List<SubCategoryEntity>>

    @Query("SELECT * FROM ${SubCategoryAttr.TABLE_NAME} WHERE ${SubCategoryAttr.ATTR_CATEGORY_ID} = :categoryId AND ${SubCategoryAttr.ATTR_ACTIVE} = true ORDER BY ${SubCategoryAttr.ATTR_SUBCATEGORY_NAME} ASC")
    fun getSubCategoryByCategoryId(categoryId: Long) : Single<List<SubCategoryEntity>>

    @Query("SELECT * FROM ${SubCategoryAttr.TABLE_NAME} WHERE ${SubCategoryAttr.ATTR_SUBCATEGORY_ID} = :subCategoryId")
    fun getSubCategoryBySubCategoryId(subCategoryId: Long) : Single<SubCategoryEntity>

    @Query("SELECT * FROM ${SubCategoryAttr.TABLE_NAME} WHERE (${SubCategoryAttr.ATTR_SUBCATEGORY_NAME} LIKE '%' || :searchText || '%') AND ${SubCategoryAttr.ATTR_ACTIVE} = true ORDER BY ${SubCategoryAttr.ATTR_SUBCATEGORY_NAME} ASC")
    fun getSubCategoryBySearch(searchText: String) : Single<List<SubCategoryEntity>>

    @Insert
    fun insert(data: SubCategoryEntity) : Completable

    @Insert
    fun insert(data: List<SubCategoryEntity>) : Completable

    @Update
    fun update(data: SubCategoryEntity) : Completable

    @Delete
    fun delete(data: SubCategoryEntity) : Completable

    @Query("DELETE FROM ${SubCategoryAttr.TABLE_NAME} WHERE ${SubCategoryAttr.ATTR_TABLE_ID} in (:idList)")
    fun delete(idList: List<Int>): Completable

    @Query("DELETE FROM ${SubCategoryAttr.TABLE_NAME}")
    fun nukeData(): Completable

}