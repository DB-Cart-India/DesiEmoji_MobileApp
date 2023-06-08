package com.desiemoji.keyboard.data.local.emoji;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000f\u001a\u00020\rH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\u0014\u001a\u00020\rH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\b\u0010\u0016\u001a\u00020\u0003H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/desiemoji/keyboard/data/local/emoji/EmojiDao;", "", "delete", "Lio/reactivex/rxjava3/core/Completable;", "data", "Lcom/desiemoji/keyboard/data/local/emoji/EmojiEntity;", "idList", "", "", "getAllEmoji", "Lio/reactivex/rxjava3/core/Single;", "getEmojiByCategoryId", "categoryId", "", "getEmojiByEmojiId", "emojiId", "getEmojiBySearch", "searchText", "", "getEmojiBySubCategoryId", "subCategoryId", "insert", "nukeData", "update", "desiemoji_release"})
public abstract interface EmojiDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM emoji WHERE active = true")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> getAllEmoji();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM emoji WHERE SubCategoryId = :subCategoryId AND active = true")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> getEmojiBySubCategoryId(long subCategoryId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM emoji WHERE categoryId = :categoryId AND active = true ORDER BY SubCategoryId ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> getEmojiByCategoryId(long categoryId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM emoji WHERE emojiId = :emojiId")
    public abstract io.reactivex.rxjava3.core.Single<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> getEmojiByEmojiId(long emojiId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM emoji WHERE (emojiKeyword LIKE \'%\' || :searchText || \'%\') AND active = true")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity>> getEmojiBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.rxjava3.core.Completable insert(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.rxjava3.core.Completable insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.rxjava3.core.Completable update(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.rxjava3.core.Completable delete(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.emoji.EmojiEntity data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM emoji WHERE tableId in (:idList)")
    public abstract io.reactivex.rxjava3.core.Completable delete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM emoji")
    public abstract io.reactivex.rxjava3.core.Completable nukeData();
}