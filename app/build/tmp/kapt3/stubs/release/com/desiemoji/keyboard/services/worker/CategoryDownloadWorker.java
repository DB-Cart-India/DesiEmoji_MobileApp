package com.desiemoji.keyboard.services.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/desiemoji/keyboard/services/worker/CategoryDownloadWorker;", "Landroidx/work/Worker;", "ctx", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "emojiAPI", "Lcom/desiemoji/keyboard/data/remote/emoji/EmojiApi;", "myCompositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "doWork", "Landroidx/work/ListenableWorker$Result;", "desiemoji_release"})
public final class CategoryDownloadWorker extends androidx.work.Worker {
    private io.reactivex.rxjava3.disposables.CompositeDisposable myCompositeDisposable;
    private com.desiemoji.keyboard.data.remote.emoji.EmojiApi emojiAPI;
    
    public CategoryDownloadWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
}