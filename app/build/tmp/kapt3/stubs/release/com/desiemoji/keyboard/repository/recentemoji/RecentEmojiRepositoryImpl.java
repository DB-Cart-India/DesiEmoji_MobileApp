package com.desiemoji.keyboard.repository.recentemoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u0019H\u0016J$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u0019H\u0016J\u001e\u0010\u001d\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010 \u001a\u00020\fJ\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/desiemoji/keyboard/repository/recentemoji/RecentEmojiRepositoryImpl;", "Lcom/desiemoji/keyboard/repository/recentemoji/RecentEmojiRepository;", "dao", "Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiDao;", "(Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiDao;)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "addSubscribe", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "deleteMultipleRecentEmoji", "idList", "", "", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteRecentEmoji", "emoji", "Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiEntity;", "getAllRecentEmojis", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "", "getRecentEmojisByKeyword", "code", "insertAllRecentEmoji", "insertRecentEmoji", "nukeRecentEmoji", "onClearDisposables", "updateRecentEmoji", "desiemoji_release"})
public final class RecentEmojiRepositoryImpl implements com.desiemoji.keyboard.repository.recentemoji.RecentEmojiRepository {
    private final com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao dao = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    
    @javax.inject.Inject()
    public RecentEmojiRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao dao) {
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
    public void getAllRecentEmojis(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<java.lang.String>> callback) {
    }
    
    @java.lang.Override()
    public void getRecentEmojisByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity>> callback) {
    }
    
    @java.lang.Override()
    public void insertRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void insertAllRecentEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity> emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void updateRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void deleteMultipleRecentEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
    
    @java.lang.Override()
    public void nukeRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback) {
    }
}