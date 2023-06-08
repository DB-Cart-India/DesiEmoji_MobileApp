package com.desiemoji.keyboard.ui.autotext;

import java.lang.System;

/**
 * Created by Faisal Amir on 11/03/23
 * https://github.com/amirisback
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/desiemoji/keyboard/ui/autotext/AutoTextEditorActivity;", "Lcom/desiemoji/keyboard/common/base/BaseActivity;", "Lcom/desiemoji/keyboard/databinding/ActivityAutotextEditorBinding;", "()V", "viewModel", "Lcom/desiemoji/keyboard/ui/autotext/AutoTextViewModel;", "getViewModel", "()Lcom/desiemoji/keyboard/ui/autotext/AutoTextViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "autoText", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "hasExtraDetail", "", "onCreateExt", "", "savedInstanceState", "Landroid/os/Bundle;", "setupInsert", "setupUI", "setupUpdate", "setupViewBinding", "setupViewModel", "Companion", "desiemoji_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AutoTextEditorActivity extends com.desiemoji.keyboard.common.base.BaseActivity<com.desiemoji.keyboard.databinding.ActivityAutotextEditorBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.ui.autotext.AutoTextEditorActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AUTO_TEXT_EDIT = "EXTRA_AUTO_TEXT_EDIT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AUTO_TEXT_EDIT_RESULT = "EXTRA_AUTO_TEXT_EDIT_RESULT";
    public static final int RESULT_CODE_ADD = 100;
    public static final int RESULT_CODE_UPDATE = 101;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AutoTextEditorActivity() {
        super();
    }
    
    private final com.desiemoji.keyboard.ui.autotext.AutoTextViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.desiemoji.keyboard.databinding.ActivityAutotextEditorBinding setupViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setupViewModel() {
    }
    
    @java.lang.Override()
    public void onCreateExt(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText() {
        return null;
    }
    
    private final boolean hasExtraDetail() {
        return false;
    }
    
    private final void setupInsert() {
    }
    
    private final void setupUpdate() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/desiemoji/keyboard/ui/autotext/AutoTextEditorActivity$Companion;", "", "()V", "EXTRA_AUTO_TEXT_EDIT", "", "EXTRA_AUTO_TEXT_EDIT_RESULT", "RESULT_CODE_ADD", "", "RESULT_CODE_UPDATE", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}