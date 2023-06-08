package com.desiemoji.keyboard.ui.keyboard.emoji.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001-BF\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\u0002\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020\u00102\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\"H\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\"H\u0016J\u0018\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomEmojiAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomEmojiAdapter$ViewHolder;", "stickerSender", "Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;", "context", "Landroid/content/Context;", "items", "", "Lcom/desiemoji/keyboard/data/local/emoji/EmojiEntity;", "itemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "emoji", "", "(Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getStickerSender", "()Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;", "setStickerSender", "(Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupEmoji", "view", "Landroid/view/View;", "ViewHolder", "desiemoji_release"})
public final class CustomEmojiAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomEmojiAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.desiemoji.keyboard.ui.keyboard.StickerSender stickerSender;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> items;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> itemClick = null;
    private final android.view.LayoutInflater layoutInflater = null;
    
    public CustomEmojiAdapter(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.StickerSender stickerSender, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> itemClick) {
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
    public final java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.desiemoji.keyboard.data.local.emoji.EmojiEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getItemClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomEmojiAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomEmojiAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void setupEmoji(android.view.View view, com.desiemoji.keyboard.data.local.emoji.EmojiEntity emoji) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\f0\t\u00a8\u0006\r"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomEmojiAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/CustomEmojiAdapter;Landroid/view/View;)V", "bindView", "emoji", "Lcom/desiemoji/keyboard/data/local/emoji/EmojiEntity;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "desiemoji_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View bindView(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.data.local.emoji.EmojiEntity emoji, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> callback) {
            return null;
        }
    }
}