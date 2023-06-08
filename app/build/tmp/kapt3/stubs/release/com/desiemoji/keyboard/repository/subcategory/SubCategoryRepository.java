package com.desiemoji.keyboard.repository.subcategory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\rH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\rH&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\rH&J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\u001e\u0010\u0016\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u001a"}, d2 = {"Lcom/desiemoji/keyboard/repository/subcategory/SubCategoryRepository;", "", "deleteMultipleSubCategory", "", "idList", "", "", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteSubCategory", "data", "Lcom/desiemoji/keyboard/data/local/subcategory/SubCategoryEntity;", "getAllSubCategory", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getSubCategoryByCategoryId", "categoryId", "", "getSubCategoryBySearch", "searchText", "", "getSubCategoryBySubCategoryId", "subCategoryId", "insertAllSubCategory", "insertSubCategory", "nukeSubCategory", "updateSubCategory", "desiemoji_release"})
public abstract interface SubCategoryRepository {
    
    public abstract void getAllSubCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity>> callback);
    
    public abstract void getSubCategoryByCategoryId(long categoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity>> callback);
    
    public abstract void getSubCategoryBySubCategoryId(long subCategoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity> callback);
    
    public abstract void getSubCategoryBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity>> callback);
    
    public abstract void insertSubCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void insertAllSubCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity> data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void updateSubCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteSubCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteMultipleSubCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void nukeSubCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
}