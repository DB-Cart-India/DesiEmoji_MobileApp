package com.desiemoji.keyboard.common.base;

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
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\rJ\b\u0010 \u001a\u00020!H&J\u0016\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001bJ\r\u0010%\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010R\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006&"}, d2 = {"Lcom/desiemoji/keyboard/common/base/BaseKeyboard;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "currentInputConnection", "Landroid/view/inputmethod/InputConnection;", "getCurrentInputConnection", "()Landroid/view/inputmethod/InputConnection;", "setCurrentInputConnection", "(Landroid/view/inputmethod/InputConnection;)V", "currentInputEditorInfo", "Landroid/view/inputmethod/EditorInfo;", "getCurrentInputEditorInfo", "()Landroid/view/inputmethod/EditorInfo;", "setCurrentInputEditorInfo", "(Landroid/view/inputmethod/EditorInfo;)V", "onCreate", "", "setInputConnection", "inputConnection", "editorInfo", "setupViewBinding", "desiemoji_release"})
public abstract class BaseKeyboard<T extends androidx.viewbinding.ViewBinding> extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private T binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.inputmethod.InputConnection currentInputConnection;
    @org.jetbrains.annotations.Nullable()
    private android.view.inputmethod.EditorInfo currentInputEditorInfo;
    
    public BaseKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputConnection getCurrentInputConnection() {
        return null;
    }
    
    public final void setCurrentInputConnection(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.InputConnection p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() {
        return null;
    }
    
    public final void setCurrentInputEditorInfo(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract T setupViewBinding();
    
    public abstract void onCreate();
    
    public BaseKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public BaseKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    public final void setInputConnection(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.InputConnection inputConnection, @org.jetbrains.annotations.NotNull()
    android.view.inputmethod.EditorInfo editorInfo) {
    }
}