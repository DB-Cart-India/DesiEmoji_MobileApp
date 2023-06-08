package com.desiemoji.keyboard.ui.keyboard;

import java.lang.System;

/**
 * The StickerSender Class used to contain all of the methods used for sending a sticker to an
 * InputConnection
 *
 * @property context: application baseContext
 * @property toaster: an instance of Toaster (used to store an error state for later reporting to the
 * user)
 * @property internalDir: the internal /stickers directory used when creating a compat sticker
 * @property currentInputConnection: the currentInputConnection. i.e. the input field that the
 * keyboard is going to send a sticker to
 * @property currentInputEditorInfo: currentInputEditorInfo. i.e. info on the input field that the
 * keyboard is going to send a sticker to
 * @property compatCache: used to track previous x converted compat stickers
 * @property imageLoader: coil imageLoader object used to convert a sticker file to a drawable ready
 * for writing to a compat sticker
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0019\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/StickerSender;", "", "context", "Landroid/content/Context;", "toaster", "Lcom/desiemoji/keyboard/util/Toaster;", "internalDir", "Ljava/io/File;", "currentInputConnection", "Landroid/view/inputmethod/InputConnection;", "currentInputEditorInfo", "Landroid/view/inputmethod/EditorInfo;", "compatCache", "Lcom/desiemoji/keyboard/util/Cache;", "imageLoader", "Lcoil/ImageLoader;", "(Landroid/content/Context;Lcom/desiemoji/keyboard/util/Toaster;Ljava/io/File;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Lcom/desiemoji/keyboard/util/Cache;Lcoil/ImageLoader;)V", "supportedMimes", "", "", "doCommitContent", "", "mimeType", "file", "doFallbackCommitContent", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCommitContentSupported", "", "editorInfo", "sendSticker", "filePng", "fileWebP", "desiemoji_debug"})
public final class StickerSender {
    private final android.content.Context context = null;
    private final com.desiemoji.keyboard.util.Toaster toaster = null;
    private final java.io.File internalDir = null;
    private final android.view.inputmethod.InputConnection currentInputConnection = null;
    private final android.view.inputmethod.EditorInfo currentInputEditorInfo = null;
    private final com.desiemoji.keyboard.util.Cache compatCache = null;
    private final coil.ImageLoader imageLoader = null;
    private final java.util.List<java.lang.String> supportedMimes = null;
    
    public StickerSender(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.util.Toaster toaster, @org.jetbrains.annotations.NotNull()
    java.io.File internalDir, @org.jetbrains.annotations.Nullable()
    android.view.inputmethod.InputConnection currentInputConnection, @org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo currentInputEditorInfo, @org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.util.Cache compatCache, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader) {
        super();
    }
    
    /**
     * Start the process of sending a sticker when the sticker is tapped in the
     * keyboard. If the sticker type is not supported by the InputConnection then
     * doFallbackCommitContent, otherwise doCommitContent
     *
     * @param file
     */
    public final void sendSticker(@org.jetbrains.annotations.NotNull()
    java.io.File filePng, @org.jetbrains.annotations.NotNull()
    java.io.File fileWebP) {
    }
    
    /**
     * In the event that a mimetype is unsupported by a InputConnectionCompat (looking at you,
     * Signal) create a temporary png and send that. In the event that png is not supported, alert
     * the user.
     *
     * @param file: File
     */
    private final java.lang.Object doFallbackCommitContent(java.io.File file, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Send a sticker file to a InputConnectionCompat
     *
     * @param mimeType String
     * @param file File
     */
    private final void doCommitContent(java.lang.String mimeType, java.io.File file) {
    }
    
    /**
     * Check if the sticker is supported by the receiver
     *
     * @param editorInfo: EditorInfo - the editor/ receiver
     * @param mimeType: String - the image mimetype
     * @return boolean - is the mimetype supported?
     */
    private final boolean isCommitContentSupported(android.view.inputmethod.EditorInfo editorInfo, java.lang.String mimeType) {
        return false;
    }
}