package com.desiemoji.keyboard.repository.subcategory

import com.desiemoji.keyboard.common.callback.DataResponseCallback
import com.desiemoji.keyboard.common.callback.StateResponseCallback
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity

interface SubCategoryRepository {

    fun getAllSubCategory(callback: DataResponseCallback<List<SubCategoryEntity>>)

    fun getSubCategoryByCategoryId(categoryId: Long, callback: DataResponseCallback<List<SubCategoryEntity>>)

    fun getSubCategoryBySubCategoryId(subCategoryId: Long, callback: DataResponseCallback<SubCategoryEntity>)

    fun getSubCategoryBySearch(searchText: String, callback: DataResponseCallback<List<SubCategoryEntity>>)

    fun insertSubCategory(data: SubCategoryEntity, callback: StateResponseCallback)

    fun insertAllSubCategory(data: List<SubCategoryEntity>, callback: StateResponseCallback)

    fun updateSubCategory(data: SubCategoryEntity, callback: StateResponseCallback)

    fun deleteSubCategory(data: SubCategoryEntity, callback: StateResponseCallback)

    fun deleteMultipleSubCategory(idList: List<Int>, callback: StateResponseCallback)

    fun nukeSubCategory(callback: StateResponseCallback)
    
}