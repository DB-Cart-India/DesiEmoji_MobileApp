package com.desiemoji.keyboard.repository.autotext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\fH&J$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\fH&J$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\fH&J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\fH&J$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\fH&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u001b"}, d2 = {"Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepository;", "", "deleteAutoText", "", "autoText", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "callback", "Lcom/desiemoji/keyboard/common/callback/StateResponseCallback;", "idList", "", "", "getAutoText", "Lcom/desiemoji/keyboard/common/callback/DataResponseCallback;", "getAutoTextByBody", "body", "", "getAutoTextByLabel", "label", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextLabel;", "getAutoTextByTitle", "title", "getAutoTextByTitleOrBody", "keyword", "insertAutoText", "autoTexts", "nukeAutoText", "updateAutoText", "desiemoji_debug"})
public abstract interface AutoTextRepository {
    
    public abstract void getAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback);
    
    public abstract void getAutoTextByLabel(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextLabel label, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback);
    
    public abstract void getAutoTextByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback);
    
    public abstract void getAutoTextByBody(@org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback);
    
    public abstract void getAutoTextByTitleOrBody(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.DataResponseCallback<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> callback);
    
    public abstract void insertAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void insertAutoText(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity> autoTexts, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void updateAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void deleteAutoText(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> idList, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
    
    public abstract void nukeAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.common.callback.StateResponseCallback callback);
}