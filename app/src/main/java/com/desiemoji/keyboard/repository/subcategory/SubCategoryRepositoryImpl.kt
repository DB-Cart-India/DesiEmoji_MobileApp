package com.desiemoji.keyboard.repository.subcategory

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity
import com.frogobox.sdk.ext.executeRoomDB
import com.frogobox.sdk.ext.fetchRoomDB
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class SubCategoryRepositoryImpl @Inject constructor(
    private val dao: SubCategoryDao,
) : SubCategoryRepository {

    private val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    fun onClearDisposables() {
        compositeDisposable.clear()
    }

    fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun getAllSubCategory(callback: DataResponseCallback<List<SubCategoryEntity>>) {
        dao.getAllSubCategory().fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getSubCategoryByCategoryId(
        categoryId: Long,
        callback: DataResponseCallback<List<SubCategoryEntity>>,
    ) {
        dao.getSubCategoryByCategoryId(categoryId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getSubCategoryBySubCategoryId(
        subCategoryId: Long,
        callback: DataResponseCallback<SubCategoryEntity>,
    ) {
        dao.getSubCategoryBySubCategoryId(subCategoryId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getSubCategoryBySearch(
        searchText: String,
        callback: DataResponseCallback<List<SubCategoryEntity>>,
    ) {
        dao.getSubCategoryBySearch(searchText).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }


    override fun insertSubCategory(data: SubCategoryEntity, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun insertAllSubCategory(data: List<SubCategoryEntity>, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun updateSubCategory(data: SubCategoryEntity, callback: StateResponseCallback) {
        dao.update(data).executeRoomDB(callback)
    }

    override fun deleteSubCategory(data: SubCategoryEntity, callback: StateResponseCallback) {
        dao.delete(data).executeRoomDB(callback)
    }

    override fun deleteMultipleSubCategory(idList: List<Int>, callback: StateResponseCallback) {
        dao.delete(idList).executeRoomDB(callback)
    }

    override fun nukeSubCategory(callback: StateResponseCallback) {
        dao.nukeData().executeRoomDB(callback)
    }

}