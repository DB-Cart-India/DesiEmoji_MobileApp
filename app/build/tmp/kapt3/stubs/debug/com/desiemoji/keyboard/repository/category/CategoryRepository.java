package com.desiemoji.keyboard.repository.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J\u001e\u0010\u0014\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0018"}, d2 = {"Lcom/desiemoji/keyboard/repository/category/CategoryRepository;", "", "deleteCategory", "", "data", "Lcom/desiemoji/keyboard/data/local/category/CategoryEntity;", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteMultipleCategory", "idList", "", "", "getAllCategory", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getCategoryByCategoryId", "categoryId", "", "getCategoryBySearch", "searchText", "", "insertAllCategory", "insertCategory", "nukeCategory", "updateCategory", "desiemoji_debug"})
public abstract interface CategoryRepository {
    
    public abstract void getAllCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity>> callback);
    
    public abstract void getCategoryByCategoryId(long categoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<com.desiemoji.keyboard.data.local.category.CategoryEntity> callback);
    
    public abstract void getCategoryBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity>> callback);
    
    public abstract void insertCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void insertAllCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity> data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void updateCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteMultipleCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void nukeCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
}