package com.desiemoji.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/desiemoji/keyboard/MainApp;", "Lcom/frogobox/sdk/FrogoKoinApplication;", "()V", "onCreate", "", "setupEmojiCompat", "setupKoinModule", "koinApplication", "Lorg/koin/core/KoinApplication;", "Companion", "desiemoji_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MainApp extends com.frogobox.sdk.FrogoKoinApplication {
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.MainApp.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static com.desiemoji.keyboard.MainApp instance;
    
    public MainApp() {
        super();
    }
    
    @java.lang.Override()
    public void setupKoinModule(@org.jetbrains.annotations.NotNull()
    org.koin.core.KoinApplication koinApplication) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setupEmojiCompat() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/desiemoji/keyboard/MainApp$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/desiemoji/keyboard/MainApp;", "getInstance", "()Lcom/desiemoji/keyboard/MainApp;", "setInstance", "(Lcom/desiemoji/keyboard/MainApp;)V", "getContext", "Landroid/content/Context;", "getCurrentLocale", "Ljava/util/Locale;", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.desiemoji.keyboard.MainApp getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.MainApp p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Locale getCurrentLocale() {
            return null;
        }
    }
}