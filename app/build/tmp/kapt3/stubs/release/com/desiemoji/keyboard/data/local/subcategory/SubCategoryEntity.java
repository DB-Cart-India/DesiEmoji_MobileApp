package com.desiemoji.keyboard.data.local.subcategory;

import java.lang.System;

@androidx.room.Entity(tableName = "subcategory")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\rH\u00c6\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a\u00a8\u00065"}, d2 = {"Lcom/desiemoji/keyboard/data/local/subcategory/SubCategoryEntity;", "", "tableId", "", "subCategoryId", "subCategoryName", "", "categoryId", "subCategoryIcon", "subCategoryIconPath", "createdAt", "updatedAt", "active", "", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getActive", "()Z", "setActive", "(Z)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getSubCategoryIcon", "setSubCategoryIcon", "getSubCategoryIconPath", "setSubCategoryIconPath", "getSubCategoryId", "setSubCategoryId", "getSubCategoryName", "setSubCategoryName", "getTableId", "setTableId", "getUpdatedAt", "setUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "desiemoji_release"})
public final class SubCategoryEntity {
    @androidx.room.ColumnInfo(name = "tableId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int tableId;
    @androidx.room.ColumnInfo(name = "SubCategoryId")
    private int subCategoryId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SubCategoryName")
    private java.lang.String subCategoryName;
    @androidx.room.ColumnInfo(name = "categoryId")
    private int categoryId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "subCategoryIcon")
    private java.lang.String subCategoryIcon;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "subCategoryIconPath")
    private java.lang.String subCategoryIconPath;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "createdAt")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "updatedAt")
    private java.lang.String updatedAt;
    @androidx.room.ColumnInfo(name = "active")
    private boolean active;
    
    @org.jetbrains.annotations.NotNull()
    public final com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity copy(int tableId, int subCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryName, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryIconPath, @org.jetbrains.annotations.NotNull()
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
    
    public SubCategoryEntity() {
        super();
    }
    
    public SubCategoryEntity(int tableId, int subCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryName, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String subCategoryIconPath, @org.jetbrains.annotations.NotNull()
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
    
    public final int getSubCategoryId() {
        return 0;
    }
    
    public final void setSubCategoryId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubCategoryName() {
        return null;
    }
    
    public final void setSubCategoryName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    public final void setCategoryId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubCategoryIcon() {
        return null;
    }
    
    public final void setSubCategoryIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubCategoryIconPath() {
        return null;
    }
    
    public final void setSubCategoryIconPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
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
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
}