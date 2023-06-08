package com.desiemoji.keyboard.ui.keyboard.main;

import java.lang.System;

/**
 * Created by Faisal Amir on 07/11/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/OnKeyboardActionListener;", "", "moveCursorLeft", "", "moveCursorRight", "onActionUp", "onHideKeyboardOnly", "onKey", "code", "", "onPress", "primaryCode", "onText", "text", "", "desiemoji_release"})
public abstract interface OnKeyboardActionListener {
    
    /**
     * Called when the user presses a key. This is sent before the [.onKey] is called. For keys that repeat, this is only called once.
     * @param primaryCode the unicode of the key being pressed. If the touch is not on a valid key, the value will be zero.
     */
    public abstract void onPress(int primaryCode);
    
    /**
     * Send a key press to the listener.
     * @param code this is the key that was pressed
     */
    public abstract void onKey(int code);
    
    /**
     * Called when the finger has been lifted after pressing a key
     */
    public abstract void onActionUp();
    
    /**
     * Called when the user long presses Space and moves to the left
     */
    public abstract void moveCursorLeft();
    
    /**
     * Called when the user long presses Space and moves to the right
     */
    public abstract void moveCursorRight();
    
    /**
     * Sends a sequence of characters to the listener.
     * @param text the string to be displayed.
     */
    public abstract void onText(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    public abstract void onHideKeyboardOnly();
}