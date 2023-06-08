package com.desiemoji.keyboard.data.local.category

import androidx.room.*
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface CategoryDao {

    @Query("SELECT * FROM ${CategoryAttr.TABLE_NAME} WHERE ${CategoryAttr.ATTR_ACTIVE} = true")
    fun getAllCategory() : Single<List<CategoryEntity>>

    @Query("SELECT * FROM ${CategoryAttr.TABLE_NAME} WHERE ${CategoryAttr.ATTR_CATEGORY_ID} = :categoryId")
    fun getCategoryByCategoryId(categoryId: Long) : Single<CategoryEntity>

    @Query("SELECT * FROM ${CategoryAttr.TABLE_NAME} WHERE ${CategoryAttr.ATTR_CATEGORY_NAME} LIKE '%' || :searchText || '%' AND ${CategoryAttr.ATTR_ACTIVE} = true")
    fun getCategoryBySearch(searchText: String) : Single<List<CategoryEntity>>

    @Insert
    fun insert(data: CategoryEntity) : Completable

    @Insert
    fun insert(data: List<CategoryEntity>) : Completable

    @Update
    fun update(data: CategoryEntity) : Completable

    @Delete
    fun delete(data: CategoryEntity) : Completable

    @Query("DELETE FROM ${CategoryAttr.TABLE_NAME} WHERE ${CategoryAttr.ATTR_TABLE_ID} in (:idList)")
    fun delete(idList: List<Int>): Completable

    @Query("DELETE FROM ${CategoryAttr.TABLE_NAME}")
    fun nukeData(): Completable
}