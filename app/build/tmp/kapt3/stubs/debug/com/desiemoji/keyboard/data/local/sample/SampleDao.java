package com.desiemoji.keyboard.data.local.sample;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\b\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/desiemoji/keyboard/data/local/sample/SampleDao;", "", "getMusics", "Lio/reactivex/rxjava3/core/Single;", "", "Lcom/desiemoji/keyboard/data/local/sample/SampleEntity;", "insertMusics", "Lio/reactivex/rxjava3/core/Completable;", "articles", "nukeData", "desiemoji_debug"})
public abstract interface SampleDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sample")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.desiemoji.keyboard.data.local.sample.SampleEntity>> getMusics();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM sample")
    public abstract io.reactivex.rxjava3.core.Completable nukeData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = 1)
    public abstract io.reactivex.rxjava3.core.Completable insertMusics(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.sample.SampleEntity> articles);
}