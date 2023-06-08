package com.desiemoji.keyboard.repository.emoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\f\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J$\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH&J\u001e\u0010\u0018\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u001c"}, d2 = {"Lcom/desiemoji/keyboard/repository/emoji/EmojiRepository;", "", "deleteEmoji", "", "data", "Lcom/desiemoji/keyboard/data/local/emoji/EmojiEntity;", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "deleteMultipleEmoji", "idList", "", "", "getAllEmoji", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getEmojiByCategoryId", "categoryId", "", "getEmojiByEmojiId", "emojiId", "getEmojiBySearch", "searchText", "", "getEmojiBySubCategoryId", "subCategoryId", "insertAllEmoji", "insertEmoji", "nukeEmoji", "updateEmoji", "desiemoji_release"})
public abstract interface EmojiRepository {
    
    public abstract void getAllEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> callback);
    
    public abstract void getEmojiBySubCategoryId(long subCategoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> callback);
    
    public abstract void getEmojiByCategoryId(long categoryId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> callback);
    
    public abstract void getEmojiByEmojiId(long emojiId, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> callback);
    
    public abstract void getEmojiBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> callback);
    
    public abstract void insertEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void insertAllEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void updateEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteMultipleEmoji(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void nukeEmoji(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
}