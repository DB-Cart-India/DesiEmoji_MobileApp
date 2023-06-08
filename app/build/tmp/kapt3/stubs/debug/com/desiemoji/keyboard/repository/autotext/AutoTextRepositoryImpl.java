package com.desiemoji.keyboard.repository.autotext;

import java.lang.System;

/**
 * Created by Faisal Amir on 10/03/23
 * https://github.com/amirisback
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u000f\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0018H\u0016J$\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0018H\u0016J$\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0018H\u0016J$\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0018H\u0016J$\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0018H\u0016J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010#\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010&\u001a\u00020\fJ\u0018\u0010\'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepositoryImpl;", "Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepository;", "dao", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextDao;", "(Lcom/desiemoji/keyboard/data/local/autotext/AutoTextDao;)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "addSubscribe", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "deleteAutoText", "autoText", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "idList", "", "", "getAutoText", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getAutoTextByBody", "body", "", "getAutoTextByLabel", "label", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextLabel;", "getAutoTextByTitle", "title", "getAutoTextByTitleOrBody", "keyword", "insertAutoText", "autoTexts", "nukeAutoText", "onClearDisposables", "updateAutoText", "desiemoji_debug"})
public final class AutoTextRepositoryImpl implements com.desiemoji.keyboard.repository.autotext.AutoTextRepository {
    private final com.desiemoji.keyboard.data.local.autotext.AutoTextDao dao = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    
    @javax.inject.Inject()
    public AutoTextRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextDao dao) {
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
    public void getAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback) {
    }
    
    @java.lang.Override()
    public void getAutoTextByLabel(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextLabel label, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback) {
    }
    
    @java.lang.Override()
    public void getAutoTextByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback) {
    }
    
    @java.lang.Override()
    public void getAutoTextByBody(@org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback) {
    }
    
    @java.lang.Override()
    public void getAutoTextByTitleOrBody(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback) {
    }
    
    @java.lang.Override()
    public void insertAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void insertAutoText(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity> autoTexts, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void updateAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteAutoText(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void nukeAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
}