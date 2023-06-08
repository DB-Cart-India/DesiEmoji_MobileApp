package com.desiemoji.keyboard.data.remote.emoji;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/desiemoji/keyboard/data/remote/emoji/EmojiApi;", "", "getAllCategory", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/desiemoji/keyboard/data/remote/emoji/CategoryResponse;", "reqData", "Lcom/desiemoji/keyboard/data/remote/emoji/CommonRequestData;", "getAllEmoji", "Lcom/desiemoji/keyboard/data/remote/emoji/EmojiResponse;", "getAllSubCategory", "Lcom/desiemoji/keyboard/data/remote/emoji/SubCategoryResponse;", "Creator", "desiemoji_release"})
public abstract interface EmojiApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "categories/getall/date")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract io.reactivex.rxjava3.core.Observable<com.desiemoji.keyboard.data.remote.emoji.CategoryResponse> getAllCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.desiemoji.keyboard.data.remote.emoji.CommonRequestData reqData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "subcategories/getall/date")
    public abstract io.reactivex.rxjava3.core.Observable<com.desiemoji.keyboard.data.remote.emoji.SubCategoryResponse> getAllSubCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.desiemoji.keyboard.data.remote.emoji.CommonRequestData reqData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "emojis/getall/date")
    public abstract io.reactivex.rxjava3.core.Observable<com.desiemoji.keyboard.data.remote.emoji.EmojiResponse> getAllEmoji(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.desiemoji.keyboard.data.remote.emoji.CommonRequestData reqData);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/desiemoji/keyboard/data/remote/emoji/EmojiApi$Creator;", "", "()V", "newInstance", "Lcom/desiemoji/keyboard/data/remote/emoji/EmojiApi;", "context", "Landroid/content/Context;", "desiemoji_release"})
    public static final class Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.desiemoji.keyboard.data.remote.emoji.EmojiApi newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}