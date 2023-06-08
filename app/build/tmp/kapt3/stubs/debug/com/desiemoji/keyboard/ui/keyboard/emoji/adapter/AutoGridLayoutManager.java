package com.desiemoji.keyboard.ui.keyboard.emoji.adapter;

import java.lang.System;

/**
 * RecyclerView GridLayoutManager but with automatic spanCount calculation.
 *
 * @param context The initiating view's context.
 * @param itemWidth: Grid item width in pixels. Will be used to calculate span count.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0018\u00010\nR\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/emoji/adapter/AutoGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "itemWidth", "", "(Landroid/content/Context;I)V", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "desiemoji_debug"})
public final class AutoGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    private int itemWidth;
    
    public AutoGridLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemWidth) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override()
    public void onLayoutChildren(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
}