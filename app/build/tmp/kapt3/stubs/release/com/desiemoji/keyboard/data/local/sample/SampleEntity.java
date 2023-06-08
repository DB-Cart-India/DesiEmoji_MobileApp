package com.desiemoji.keyboard.data.local.sample;

import java.lang.System;

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */
@androidx.room.Entity(tableName = "sample")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/desiemoji/keyboard/data/local/sample/SampleEntity;", "", "table_id", "", "id", "data", "", "(IILjava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getTable_id", "setTable_id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "desiemoji_release"})
public final class SampleEntity {
    @androidx.room.ColumnInfo(name = "table_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int table_id;
    @androidx.room.ColumnInfo(name = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data")
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.lang.String data;
    
    /**
     * Created by Faisal Amir on 06/01/23
     * -----------------------------------------
     * E-mail   : faisalamircs@gmail.com
     * Github   : github.com/amirisback
     * -----------------------------------------
     * Copyright (C) Frogobox ID / amirisback
     * All rights reserved
     */
    @org.jetbrains.annotations.NotNull()
    public final com.desiemoji.keyboard.data.local.sample.SampleEntity copy(int table_id, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    /**
     * Created by Faisal Amir on 06/01/23
     * -----------------------------------------
     * E-mail   : faisalamircs@gmail.com
     * Github   : github.com/amirisback
     * -----------------------------------------
     * Copyright (C) Frogobox ID / amirisback
     * All rights reserved
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by Faisal Amir on 06/01/23
     * -----------------------------------------
     * E-mail   : faisalamircs@gmail.com
     * Github   : github.com/amirisback
     * -----------------------------------------
     * Copyright (C) Frogobox ID / amirisback
     * All rights reserved
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Faisal Amir on 06/01/23
     * -----------------------------------------
     * E-mail   : faisalamircs@gmail.com
     * Github   : github.com/amirisback
     * -----------------------------------------
     * Copyright (C) Frogobox ID / amirisback
     * All rights reserved
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SampleEntity() {
        super();
    }
    
    public SampleEntity(int table_id, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTable_id() {
        return 0;
    }
    
    public final void setTable_id(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}