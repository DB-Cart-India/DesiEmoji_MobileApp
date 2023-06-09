package com.desiemoji.keyboard.ui.autotext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/desiemoji/keyboard/ui/autotext/AutoTextDetailActivity;", "Lcom/desiemoji/keyboard/common/base/BaseActivity;", "Lcom/desiemoji/keyboard/databinding/ActivityAutotextDetailBinding;", "()V", "viewModel", "Lcom/desiemoji/keyboard/ui/autotext/AutoTextViewModel;", "getViewModel", "()Lcom/desiemoji/keyboard/ui/autotext/AutoTextViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "autoText", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "doOnBackPressedExt", "", "onCreateExt", "savedInstanceState", "Landroid/os/Bundle;", "setupActivityResultExt", "result", "Landroidx/activity/result/ActivityResult;", "setupUI", "data", "setupViewBinding", "setupViewModel", "Companion", "desiemoji_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AutoTextDetailActivity extends com.desiemoji.keyboard.common.base.BaseActivity<com.desiemoji.keyboard.databinding.ActivityAutotextDetailBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.ui.autotext.AutoTextDetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AUTO_TEXT = "EXTRA_AUTO_TEXT";
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AutoTextDetailActivity() {
        super();
    }
    
    private final com.desiemoji.keyboard.ui.autotext.AutoTextViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setupViewModel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.desiemoji.keyboard.databinding.ActivityAutotextDetailBinding setupViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateExt(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setupActivityResultExt(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResult result) {
    }
    
    @java.lang.Override()
    public void doOnBackPressedExt() {
    }
    
    private final com.desiemoji.keyboard.data.local.autotext.AutoTextEntity autoText() {
        return null;
    }
    
    private final void setupUI(com.desiemoji.keyboard.data.local.autotext.AutoTextEntity data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/desiemoji/keyboard/ui/autotext/AutoTextDetailActivity$Companion;", "", "()V", "EXTRA_AUTO_TEXT", "", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}