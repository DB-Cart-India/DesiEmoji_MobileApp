package com.desiemoji.keyboard.repository.category

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.category.CategoryDao
import com.desiemoji.keyboard.data.local.category.CategoryEntity
import com.frogobox.sdk.ext.executeRoomDB
import com.frogobox.sdk.ext.fetchRoomDB
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class CategoryRepositoryImpl  @Inject constructor(
    private val dao: CategoryDao,
) : CategoryRepository {

    private val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    fun onClearDisposables() {
        compositeDisposable.clear()
    }

    fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun getAllCategory(callback: DataResponseCallback<List<CategoryEntity>>) {
        dao.getAllCategory().fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getCategoryByCategoryId(
        categoryId: Long,
        callback: DataResponseCallback<CategoryEntity>,
    ) {
        dao.getCategoryByCategoryId(categoryId).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }

    override fun getCategoryBySearch(
        searchText: String,
        callback: DataResponseCallback<List<CategoryEntity>>,
    ) {
        dao.getCategoryBySearch(searchText).fetchRoomDB(callback) {
            addSubscribe(it)
        }
    }


    override fun insertCategory(data: CategoryEntity, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun insertAllCategory(data: List<CategoryEntity>, callback: StateResponseCallback) {
        dao.insert(data).executeRoomDB(callback)
    }

    override fun updateCategory(data: CategoryEntity, callback: StateResponseCallback) {
        dao.update(data).executeRoomDB(callback)
    }

    override fun deleteCategory(data: CategoryEntity, callback: StateResponseCallback) {
        dao.delete(data).executeRoomDB(callback)
    }

    override fun deleteMultipleCategory(idList: List<Int>, callback: StateResponseCallback) {
        dao.delete(idList).executeRoomDB(callback)
    }

    override fun nukeCategory(callback: StateResponseCallback) {
        dao.nukeData().executeRoomDB(callback)
    }

}