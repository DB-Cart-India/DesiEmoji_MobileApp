package com.desiemoji.keyboard.data.local.autotext;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\f\u001a\u00020\rH\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\u000f\u001a\u00020\bH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\f\u001a\u00020\u0011H\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\f\u001a\u00020\rH\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\n2\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\b\u0010\u0016\u001a\u00020\u0003H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/desiemoji/keyboard/data/local/autotext/AutoTextDao;", "", "delete", "Lio/reactivex/rxjava3/core/Completable;", "autoText", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "idList", "", "", "getAll", "Lio/reactivex/rxjava3/core/Single;", "getByBody", "search", "", "getById", "id", "getByLabel", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextLabel;", "getByTitle", "getByTitleOrBody", "insert", "autoTexts", "nukeData", "update", "desiemoji_debug"})
public abstract interface AutoTextDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.rxjava3.core.Completable insert(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.rxjava3.core.Completable insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity> autoTexts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.rxjava3.core.Completable update(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.rxjava3.core.Completable delete(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM auto_text WHERE id in (:idList)")
    public abstract io.reactivex.rxjava3.core.Completable delete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM auto_text")
    public abstract io.reactivex.rxjava3.core.Completable nukeData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text ORDER BY id ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text WHERE id = :id")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text WHERE title LIKE \'%\' || :search || \'%\' ORDER BY id ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text WHERE label = :search ORDER BY id ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getByLabel(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextLabel search);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text WHERE body LIKE \'%\' || :search || \'%\' ORDER BY id ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getByBody(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM auto_text WHERE (title LIKE \'%\' || :search || \'%\' OR body LIKE \'%\' || :search || \'%\') ORDER BY id ASC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getByTitleOrBody(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
}