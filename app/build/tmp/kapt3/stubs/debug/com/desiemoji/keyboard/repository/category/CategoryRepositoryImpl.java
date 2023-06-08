package com.desiemoji.keyboard.repository.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016J$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u0019H\u0016J\u001e\u0010 \u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010#\u001a\u00020\fJ\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/desiemoji/keyboard/repository/category/CategoryRepositoryImpl;", "Lcom/desiemoji/keyboard/repository/category/CategoryRepository;", "dao", "Lcom/desiemoji/keyboard/data/local/category/CategoryDao;", "(Lcom/desiemoji/keyboard/data/local/category/CategoryDao;)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "addSubscribe", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "deleteCategory", "data", "Lcom/desiemoji/keyboard/data/local/category/CategoryEntity;", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteMultipleCategory", "idList", "", "", "getAllCategory", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getCategoryByCategoryId", "categoryId", "", "getCategoryBySearch", "searchText", "", "insertAllCategory", "insertCategory", "nukeCategory", "onClearDisposables", "updateCategory", "desiemoji_debug"})
public final class CategoryRepositoryImpl implements com.desiemoji.keyboard.repository.category.CategoryRepository {
    private final com.desiemoji.keyboard.data.local.category.CategoryDao dao = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    
    @javax.inject.Inject()
    public CategoryRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryDao dao) {
        super();
    }
    
    private final io.reactivex.rxjava3.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void onClearDisposables() {
    }
    
    public final void addSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    @java.lang.Override()
    public void getAllCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity>> callback) {
    }
    
    @java.lang.Override()
    public void getCategoryByCategoryId(long categoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<com.desiemoji.keyboard.data.local.category.CategoryEntity> callback) {
    }
    
    @java.lang.Override()
    public void getCategoryBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity>> callback) {
    }
    
    @java.lang.Override()
    public void insertCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void insertAllCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.category.CategoryEntity> data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void updateCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.category.CategoryEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteMultipleCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void nukeCategory(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
}