package com.desiemoji.keyboard.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/desiemoji/keyboard/common/base/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/frogobox/sdk/view/FrogoBindActivity;", "()V", "initView", "", "onCreateExt", "savedInstanceState", "Landroid/os/Bundle;", "setupDebugMode", "", "desiemoji_debug"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends com.frogobox.sdk.view.FrogoBindActivity<VB> {
    
    public BaseActivity() {
        super();
    }
    
    public void initView() {
    }
    
    @java.lang.Override()
    public boolean setupDebugMode() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateExt(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}