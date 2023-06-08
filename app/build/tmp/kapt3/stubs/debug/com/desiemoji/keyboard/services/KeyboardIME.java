package com.desiemoji.keyboard.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0005H\u0017J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0003J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0005H\u0016J\u001a\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u0015H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0016J8\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0019H\u0016J\b\u0010>\u001a\u00020\u0019H\u0016J\b\u0010?\u001a\u00020\u0019H\u0002J\b\u0010@\u001a\u00020\u0019H\u0002J\b\u0010A\u001a\u00020\u0019H\u0002J\f\u0010B\u001a\u00020\u0019*\u00020CH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/desiemoji/keyboard/services/KeyboardIME;", "Landroid/inputmethodservice/InputMethodService;", "Lcom/desiemoji/keyboard/ui/keyboard/main/OnKeyboardActionListener;", "()V", "KEYBOARD_LETTERS", "", "KEYBOARD_NUMBER", "KEYBOARD_SYMBOLS", "KEYBOARD_SYMBOLS_SHIFT", "KEYCODE_EMOJI", "SHIFT_PERM_TOGGLE_SPEED", "binding", "Lcom/desiemoji/keyboard/databinding/KeyboardImeBinding;", "enterKeyType", "inputTypeClass", "keyboard", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "keyboardMode", "lastShiftPressTS", "", "switchToLetters", "", "getImeOptionsActionId", "getKeyboardLayoutXML", "hideMainKeyboard", "", "hideOnlyKeyboard", "initBackToMainKeyboard", "initCurrentInputConnection", "initView", "moveCursor", "moveRight", "moveCursorLeft", "moveCursorRight", "onActionUp", "onCreate", "onCreateInputView", "Landroid/view/View;", "onHideKeyboardOnly", "onInitializeInterface", "onKey", "code", "onKeyExt", "inputConnection", "Landroid/view/inputmethod/InputConnection;", "onPress", "primaryCode", "onStartInput", "attribute", "Landroid/view/inputmethod/EditorInfo;", "restarting", "onText", "text", "", "onUpdateSelection", "oldSelStart", "oldSelEnd", "newSelStart", "newSelEnd", "candidatesStart", "candidatesEnd", "onWindowHidden", "onWindowShown", "showMainKeyboard", "showOnlyKeyboard", "updateShiftKeyState", "showKeyboardExt", "Landroid/widget/EditText;", "desiemoji_debug"})
public final class KeyboardIME extends android.inputmethodservice.InputMethodService implements com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener {
    private int SHIFT_PERM_TOGGLE_SPEED = 500;
    private final int KEYBOARD_LETTERS = 0;
    private final int KEYBOARD_SYMBOLS = 1;
    private final int KEYBOARD_SYMBOLS_SHIFT = 2;
    private final int KEYBOARD_NUMBER = 3;
    private final int KEYCODE_EMOJI = -6;
    private com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard keyboard;
    private long lastShiftPressTS = 0L;
    private int keyboardMode;
    private int inputTypeClass = android.text.InputType.TYPE_CLASS_TEXT;
    private int enterKeyType = android.view.inputmethod.EditorInfo.IME_ACTION_NONE;
    private boolean switchToLetters = false;
    private com.desiemoji.keyboard.databinding.KeyboardImeBinding binding;
    
    public KeyboardIME() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onWindowShown() {
    }
    
    @java.lang.Override()
    public void onWindowHidden() {
    }
    
    @java.lang.Override()
    public void onInitializeInterface() {
    }
    
    private final void initCurrentInputConnection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateInputView() {
        return null;
    }
    
    @java.lang.Override()
    public void onPress(int primaryCode) {
    }
    
    @java.lang.Override()
    public void onStartInput(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.EditorInfo attribute, boolean restarting) {
    }
    
    private final void hideMainKeyboard() {
    }
    
    private final void showMainKeyboard() {
    }
    
    private final void showOnlyKeyboard() {
    }
    
    private final void hideOnlyKeyboard() {
    }
    
    private final void showKeyboardExt(android.widget.EditText $this$showKeyboardExt) {
    }
    
    private final void initBackToMainKeyboard() {
    }
    
    private final void initView() {
    }
    
    private final void updateShiftKeyState() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onKey(int code) {
    }
    
    @java.lang.Override()
    public void onActionUp() {
    }
    
    @java.lang.Override()
    public void moveCursorLeft() {
    }
    
    @java.lang.Override()
    public void moveCursorRight() {
    }
    
    @java.lang.Override()
    public void onText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onHideKeyboardOnly() {
    }
    
    @java.lang.Override()
    public void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void onKeyExt(int code, android.view.inputmethod.InputConnection inputConnection) {
    }
    
    private final void moveCursor(boolean moveRight) {
    }
    
    private final int getImeOptionsActionId() {
        return 0;
    }
    
    private final int getKeyboardLayoutXML() {
        return 0;
    }
}