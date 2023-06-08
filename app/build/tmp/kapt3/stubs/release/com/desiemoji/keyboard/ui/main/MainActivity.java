package com.desiemoji.keyboard.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0014J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/desiemoji/keyboard/ui/main/MainActivity;", "Lcom/desiemoji/keyboard/ui/main/BaseMainActivity;", "Lcom/desiemoji/keyboard/databinding/ActivityMainBinding;", "()V", "CHOSEN", "", "NONE", "PICKING", "mState", "viewModel", "Lcom/desiemoji/keyboard/ui/main/MainViewModel;", "getViewModel", "()Lcom/desiemoji/keyboard/ui/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkKeyboard", "", "copyFile", "inp", "Ljava/io/InputStream;", "out", "Ljava/io/OutputStream;", "handlingState", "initView", "isKeyboardEnabled", "", "isUsingKeyboard", "onCreateExt", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onWindowFocusChanged", "hasFocus", "setupViewBinding", "setupViewModel", "Companion", "desiemoji_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.desiemoji.keyboard.ui.main.BaseMainActivity<com.desiemoji.keyboard.databinding.ActivityMainBinding> {
    private final int NONE = 0;
    private final int PICKING = 1;
    private final int CHOSEN = 2;
    private int mState = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.ui.main.MainActivity.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.desiemoji.keyboard.ui.main.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.desiemoji.keyboard.databinding.ActivityMainBinding setupViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setupViewModel() {
    }
    
    @java.lang.Override()
    public void onCreateExt(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void copyFile(java.io.InputStream inp, java.io.OutputStream out) throws java.io.IOException {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    private final boolean isUsingKeyboard() {
        return false;
    }
    
    private final boolean isKeyboardEnabled() {
        return false;
    }
    
    private final void checkKeyboard() {
    }
    
    private final void handlingState() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/desiemoji/keyboard/ui/main/MainActivity$Companion;", "", "()V", "TAG", "", "desiemoji_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}