package com.desiemoji.keyboard.data.remote.sample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/desiemoji/keyboard/data/remote/sample/SampleApi;", "", "getSample", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/desiemoji/keyboard/common/base/BaseResponseModel;", "", "Lcom/desiemoji/keyboard/data/remote/sample/SampleResponse;", "Creator", "desiemoji_debug"})
public abstract interface SampleApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v1/sample/data.json")
    public abstract io.reactivex.rxjava3.core.Observable<com.desiemoji.keyboard.common.base.BaseResponseModel<java.util.List<com.desiemoji.keyboard.data.remote.sample.SampleResponse>>> getSample();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/desiemoji/keyboard/data/remote/sample/SampleApi$Creator;", "", "()V", "newInstance", "Lcom/desiemoji/keyboard/data/remote/sample/SampleApi;", "context", "Landroid/content/Context;", "baseUrl", "", "desiemoji_debug"})
    public static final class Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.desiemoji.keyboard.data.remote.sample.SampleApi newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String baseUrl) {
            return null;
        }
    }
}