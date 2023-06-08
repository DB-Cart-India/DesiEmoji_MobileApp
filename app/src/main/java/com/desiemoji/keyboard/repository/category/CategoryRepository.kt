package com.desiemoji.keyboard.repository.category

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.category.CategoryEntity

interface CategoryRepository {

    fun getAllCategory(callback: DataResponseCallback<List<CategoryEntity>>)

    fun getCategoryByCategoryId(categoryId: Long, callback: DataResponseCallback<CategoryEntity>)

    fun getCategoryBySearch(searchText: String, callback: DataResponseCallback<List<CategoryEntity>>)

    fun insertCategory(data: CategoryEntity, callback: StateResponseCallback)

    fun insertAllCategory(data: List<CategoryEntity>, callback: StateResponseCallback)

    fun updateCategory(data: CategoryEntity, callback: StateResponseCallback)

    fun deleteCategory(data: CategoryEntity, callback: StateResponseCallback)

    fun deleteMultipleCategory(idList: List<Int>, callback: StateResponseCallback)

    fun nukeCategory(callback: StateResponseCallback)

}