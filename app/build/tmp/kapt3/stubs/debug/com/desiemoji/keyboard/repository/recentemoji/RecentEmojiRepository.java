package com.desiemoji.keyboard.repository.recentemoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\rH&J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\rH&J\u001e\u0010\u0011\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u0015"}, d2 = {"Lcom/desiemoji/keyboard/repository/recentemoji/RecentEmojiRepository;", "", "deleteMultipleRecentEmoji", "", "idList", "", "", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteRecentEmoji", "emoji", "Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiEntity;", "getAllRecentEmojis", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "", "getRecentEmojisByKeyword", "code", "insertAllRecentEmoji", "insertRecentEmoji", "nukeRecentEmoji", "updateRecentEmoji", "desiemoji_debug"})
public abstract interface RecentEmojiRepository {
    
    public abstract void getAllRecentEmojis(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<java.lang.String>> callback);
    
    public abstract void getRecentEmojisByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity>> callback);
    
    public abstract void insertRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void insertAllRecentEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity> emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void updateRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity emoji, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteMultipleRecentEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void nukeRecentEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
}