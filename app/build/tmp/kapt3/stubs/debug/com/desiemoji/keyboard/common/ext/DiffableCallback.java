package com.desiemoji.keyboard.common.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u00030\u0002j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\nJ/\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/desiemoji/keyboard/common/ext/DiffableCallback;", "Item", "Lcom/mikepenz/fastadapter/IItem;", "Lcom/desiemoji/keyboard/common/ext/UnspecifiedTypeItem;", "Lcom/mikepenz/fastadapter/diff/DiffCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Lcom/mikepenz/fastadapter/IItem;Lcom/mikepenz/fastadapter/IItem;)Z", "areItemsTheSame", "getChangePayload", "", "oldItemPosition", "", "newItemPosition", "(Lcom/mikepenz/fastadapter/IItem;ILcom/mikepenz/fastadapter/IItem;I)Ljava/lang/Object;", "desiemoji_debug"})
public final class DiffableCallback<Item extends com.mikepenz.fastadapter.IItem<?>> implements com.mikepenz.fastadapter.diff.DiffCallback<Item> {
    
    public DiffableCallback() {
        super();
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    Item oldItem, @org.jetbrains.annotations.NotNull()
    Item newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    Item oldItem, @org.jetbrains.annotations.NotNull()
    Item newItem) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChangePayload(@org.jetbrains.annotations.NotNull()
    Item oldItem, int oldItemPosition, @org.jetbrains.annotations.NotNull()
    Item newItem, int newItemPosition) {
        return null;
    }
}