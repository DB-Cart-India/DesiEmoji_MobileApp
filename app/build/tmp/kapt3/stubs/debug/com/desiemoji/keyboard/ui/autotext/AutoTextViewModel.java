package com.desiemoji.keyboard.ui.autotext;

import java.lang.System;

/**
 * Created by Faisal Amir on 11/03/23
 * https://github.com/amirisback
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/desiemoji/keyboard/ui/autotext/AutoTextViewModel;", "Lcom/desiemoji/keyboard/common/base/BaseViewModel;", "repository", "Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepository;", "(Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepository;)V", "_autoText", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextEntity;", "autoText", "Landroidx/lifecycle/LiveData;", "getAutoText", "()Landroidx/lifecycle/LiveData;", "setAutoText", "(Landroidx/lifecycle/LiveData;)V", "deleteAutoText", "", "data", "insertAutoText", "title", "", "body", "updateAutoText", "id", "", "desiemoji_debug"})
public final class AutoTextViewModel extends com.desiemoji.keyboard.common.base.BaseViewModel {
    private final com.desiemoji.keyboard.repository.autotext.AutoTextRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> _autoText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> autoText;
    
    @javax.inject.Inject()
    public AutoTextViewModel(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.repository.autotext.AutoTextRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> getAutoText() {
        return null;
    }
    
    public final void setAutoText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.desiemoji.keyboard.data.local.autotext.AutoTextEntity>> p0) {
    }
    
    public final void getAutoText() {
    }
    
    public final void insertAutoText(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public final void deleteAutoText(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.data.local.autotext.AutoTextEntity data) {
    }
    
    public final void updateAutoText(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
}