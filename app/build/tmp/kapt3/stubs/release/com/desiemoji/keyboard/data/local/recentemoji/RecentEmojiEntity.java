package com.desiemoji.keyboard.data.local.recentemoji;

import java.lang.System;

@androidx.room.Entity(tableName = "recentemoji")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiEntity;", "", "tableId", "", "emojiCode", "", "(ILjava/lang/String;)V", "getEmojiCode", "()Ljava/lang/String;", "setEmojiCode", "(Ljava/lang/String;)V", "getTableId", "()I", "setTableId", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "desiemoji_release"})
public final class RecentEmojiEntity {
    @androidx.room.ColumnInfo(name = "tableId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int tableId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiCode")
    private java.lang.String emojiCode;
    
    @org.jetbrains.annotations.NotNull()
    public final com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity copy(int tableId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiCode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RecentEmojiEntity() {
        super();
    }
    
    public RecentEmojiEntity(int tableId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiCode) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTableId() {
        return 0;
    }
    
    public final void setTableId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiCode() {
        return null;
    }
    
    public final void setEmojiCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}