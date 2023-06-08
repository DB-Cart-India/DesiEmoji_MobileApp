package com.desiemoji.keyboard.util;

import java.lang.System;

/**
 * Class to provide utils that are shared across ewesticker.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/desiemoji/keyboard/util/Utils;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "getMimeType", "file", "Ljava/io/File;", "getSupportedMimes", "", "desiemoji_release"})
public final class Utils {
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.util.Utils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String BASE_URL = "http://103.118.17.65:82/";
    
    private Utils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    public final void setBASE_URL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Get the mimetype of a File
     *
     * @param file File file to get the mimetype of
     * @return String? Return the mimetype or none if it cannot be determined
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    /**
     * Return a MutableList of EweSticker Supported mimetypes
     *
     * @return MutableList of EweSticker Supported mimetypes
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSupportedMimes() {
        return null;
    }
}