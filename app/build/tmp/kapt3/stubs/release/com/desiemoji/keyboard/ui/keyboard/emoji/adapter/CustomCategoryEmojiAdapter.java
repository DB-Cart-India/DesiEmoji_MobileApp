package com.desiemoji.keyboard.ui.keyboard.emoji.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomCategoryEmojiAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomCategoryEmojiAdapter$ViewHolder;", "stickerSender", "Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;", "context", "Landroid/content/Context;", "items", "", "Lcom/desiemoji/keyboard/data/local/emoji/CustomSubCategoryEntity;", "(Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getStickerSender", "()Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;", "setStickerSender", "(Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupEmoji", "view", "Landroid/view/View;", "emoji", "ViewHolder", "desiemoji_release"})
public final class CustomCategoryEmojiAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomCategoryEmojiAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.desiemoji.keyboard.ui.keyboard.StickerSender stickerSender;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity> items;
    private final android.view.LayoutInflater layoutInflater = null;
    
    public CustomCategoryEmojiAdapter(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.StickerSender stickerSender, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.desiemoji.keyboard.ui.keyboard.StickerSender getStickerSender() {
        return null;
    }
    
    public final void setStickerSender(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.StickerSender p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomCategoryEmojiAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomCategoryEmojiAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void setupEmoji(android.view.View view, com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity emoji) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\f0\t\u00a8\u0006\r"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomCategoryEmojiAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomCategoryEmojiAdapter;Landroid/view/View;)V", "bindView", "emoji", "Lcom/desiemoji/keyboard/data/local/emoji/CustomSubCategoryEntity;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "desiemoji_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View bindView(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity emoji, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> callback) {
            return null;
        }
    }
}