package com.desiemoji.keyboard.data.local.emoji;

import java.lang.System;

@androidx.room.Entity(tableName = "emoji")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\u0081\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001J\t\u0010@\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b\'\u0010\u0019R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001d\u00a8\u0006A"}, d2 = {"Lcom/desiemoji/keyboard/data/local/emoji/EmojiEntity;", "", "tableId", "", "emojiId", "emojiKeyword", "", "subCategoryId", "categoryId", "emojiIcon", "emojiIconPath", "emojiIconWebp", "emojiIconWebpPath", "createdAt", "updatedAt", "active", "", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getActive", "()Z", "setActive", "(Z)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getEmojiIcon", "setEmojiIcon", "getEmojiIconPath", "setEmojiIconPath", "getEmojiIconWebp", "setEmojiIconWebp", "getEmojiIconWebpPath", "setEmojiIconWebpPath", "getEmojiId", "setEmojiId", "getEmojiKeyword", "setEmojiKeyword", "getSubCategoryId", "setSubCategoryId", "getTableId", "setTableId", "getUpdatedAt", "setUpdatedAt", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "desiemoji_release"})
public final class EmojiEntity {
    @androidx.room.ColumnInfo(name = "tableId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int tableId;
    @androidx.room.ColumnInfo(name = "emojiId")
    private int emojiId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiKeyword")
    private java.lang.String emojiKeyword;
    @androidx.room.ColumnInfo(name = "SubCategoryId")
    private int subCategoryId;
    @androidx.room.ColumnInfo(name = "categoryId")
    private int categoryId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiIcon")
    private java.lang.String emojiIcon;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiIconPath")
    private java.lang.String emojiIconPath;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiIconWebp")
    private java.lang.String emojiIconWebp;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "emojiIconWebpPath")
    private java.lang.String emojiIconWebpPath;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "createdAt")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "updatedAt")
    private java.lang.String updatedAt;
    @androidx.room.ColumnInfo(name = "active")
    private boolean active;
    
    @org.jetbrains.annotations.NotNull()
    public final com.desiemoji.keyboard.data.local.emoji.EmojiEntity copy(int tableId, int emojiId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiKeyword, int subCategoryId, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconPath, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconWebp, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconWebpPath, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, boolean active) {
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
    
    public EmojiEntity() {
        super();
    }
    
    public EmojiEntity(int tableId, int emojiId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiKeyword, int subCategoryId, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconPath, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconWebp, @org.jetbrains.annotations.NotNull()
    java.lang.String emojiIconWebpPath, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, boolean active) {
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
    
    public final int component2() {
        return 0;
    }
    
    public final int getEmojiId() {
        return 0;
    }
    
    public final void setEmojiId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiKeyword() {
        return null;
    }
    
    public final void setEmojiKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getSubCategoryId() {
        return 0;
    }
    
    public final void setSubCategoryId(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    public final void setCategoryId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiIcon() {
        return null;
    }
    
    public final void setEmojiIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiIconPath() {
        return null;
    }
    
    public final void setEmojiIconPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiIconWebp() {
        return null;
    }
    
    public final void setEmojiIconWebp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmojiIconWebpPath() {
        return null;
    }
    
    public final void setEmojiIconWebpPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
}