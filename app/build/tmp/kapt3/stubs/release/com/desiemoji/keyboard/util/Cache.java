package com.desiemoji.keyboard.util;

import java.lang.System;

/**
 * Basically this behaved like an ordered set with some maximum capacity. When this capacity is
 * exceeded an element is removed from the start
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003J\u0011\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/desiemoji/keyboard/util/Cache;", "", "size", "", "(I)V", "data", "Ljava/util/LinkedList;", "", "add", "elem", "fromSharedPref", "", "raw", "get", "idx", "toFiles", "", "Ljava/io/File;", "()[Ljava/io/File;", "toSharedPref", "desiemoji_release"})
public final class Cache {
    private final int size = 0;
    private java.util.LinkedList<java.lang.String> data;
    
    public Cache() {
        super();
    }
    
    public Cache(int size) {
        super();
    }
    
    /**
     * Logic to add an element
     *
     * @param elem
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String add(@org.jetbrains.annotations.NotNull()
    java.lang.String elem) {
        return null;
    }
    
    /**
     * Get an element
     *
     * @param idx
     */
    public final void get(int idx) {
    }
    
    /**
     * convert this to a string to write to shared-pref
     *
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toSharedPref() {
        return null;
    }
    
    /**
     * convert this to a array of files
     *
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File[] toFiles() {
        return null;
    }
    
    /**
     * convert from a string (shared-pref) to this
     */
    public final void fromSharedPref(@org.jetbrains.annotations.NotNull()
    java.lang.String raw) {
    }
}