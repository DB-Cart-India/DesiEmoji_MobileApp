package com.desiemoji.keyboard.util;

import java.lang.System;

/**
 * The Toaster class provides a simplified interface to android.widget.Toast. Pass in the
 * android.content.Context to the constructor and call the 'toast' function (others as below)
 * toaster.state keeps track of an error state or similar.
 *
 * @property context: android.content.Context. e.g. baseContext
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0019\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/desiemoji/keyboard/util/Toaster;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "state", "", "setState", "", "toast", "string", "", "toastOnState", "strings", "", "([Ljava/lang/String;)V", "desiemoji_release"})
public final class Toaster {
    private final android.content.Context context = null;
    private int state = 0;
    
    public Toaster(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Call toaster.toast with some string to always create a toast notification. Context is set when
     * Toaster is instantiated. Duration is determined based on text length
     *
     * @param string: String. Message to output
     */
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    /**
     * Call toaster.toastOnState with an array of messages to create a toast notification.
     * Context is set when Toaster is instantiated. Duration is determined based on
     * text length. The message is selected based on the state (which can be set in a callback
     * function or elsewhere
     *
     * @param strings: Array<String>. Array of potential messages to output.
     */
    public final void toastOnState(@org.jetbrains.annotations.NotNull()
    java.lang.String[] strings) {
    }
    
    /**
     * Set the state to some integer value
     *
     * @param state: Int
     */
    public final void setState(int state) {
    }
}