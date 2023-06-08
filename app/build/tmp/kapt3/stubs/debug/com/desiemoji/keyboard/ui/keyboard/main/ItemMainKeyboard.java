package com.desiemoji.keyboard.ui.keyboard.main;

import java.lang.System;

/**
 * Loads an XML description of a keyboard and stores the attributes of the keys. A keyboard consists of rows of keys.
 * @attr ref android.R.styleable#Keyboard_keyWidth
 * @attr ref android.R.styleable#Keyboard_horizontalGap
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0003=>?B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ2\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u001a\u00105\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u00106\u001a\u00020\u0018H\u0002J\u0018\u00107\u001a\u0002082\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u000204H\u0003J\u0018\u00109\u001a\u0002082\u0006\u0010.\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0002J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u0016\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016\u00a8\u0006@"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "", "context", "Landroid/content/Context;", "xmlLayoutResId", "", "enterKeyType", "(Landroid/content/Context;II)V", "layoutTemplateResId", "characters", "", "keyWidth", "(Landroid/content/Context;ILjava/lang/CharSequence;I)V", "mDefaultHeight", "mDefaultHorizontalGap", "mDefaultWidth", "mDisplayWidth", "mEnterKeyType", "mHeight", "getMHeight", "()I", "setMHeight", "(I)V", "mKeyboardHeightMultiplier", "", "getMKeyboardHeightMultiplier", "()F", "setMKeyboardHeightMultiplier", "(F)V", "mKeys", "", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Key;", "getMKeys", "()Ljava/util/List;", "setMKeys", "(Ljava/util/List;)V", "mMinWidth", "getMMinWidth", "setMMinWidth", "mRows", "Ljava/util/ArrayList;", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Row;", "mShiftState", "getMShiftState", "setMShiftState", "createKeyFromXml", "res", "Landroid/content/res/Resources;", "parent", "x", "y", "parser", "Landroid/content/res/XmlResourceParser;", "createRowFromXml", "getKeyboardHeightMultiplier", "loadKeyboard", "", "parseKeyboardAttributes", "setShifted", "", "shiftState", "Companion", "Key", "Row", "desiemoji_debug"})
public final class ItemMainKeyboard {
    
    /**
     * Horizontal gap default for all rows
     */
    private int mDefaultHorizontalGap = 0;
    
    /**
     * Default key width
     */
    private int mDefaultWidth = 0;
    
    /**
     * Default key height
     */
    private int mDefaultHeight = 0;
    
    /**
     * Multiplier for the keyboard height
     */
    private float mKeyboardHeightMultiplier = 1.0F;
    
    /**
     * Is the keyboard in the shifted state
     */
    private int mShiftState = 0;
    
    /**
     * Total height of the keyboard, including the padding and keys
     */
    private int mHeight = 0;
    
    /**
     * Total width of the keyboard, including left side gaps and keys, but not any gaps on the right side.
     */
    private int mMinWidth = 0;
    
    /**
     * List of keys in this keyboard
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> mKeys;
    
    /**
     * Width of the screen available to fit the keyboard
     */
    private int mDisplayWidth = 0;
    
    /**
     * What icon should we show at Enter key
     */
    private int mEnterKeyType = android.view.inputmethod.EditorInfo.IME_ACTION_NONE;
    
    /**
     * Keyboard rows
     */
    private final java.util.ArrayList<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Row> mRows = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Companion Companion = null;
    private static final java.lang.String TAG_KEYBOARD = "Keyboard";
    private static final java.lang.String TAG_ROW = "Row";
    private static final java.lang.String TAG_KEY = "Key";
    private static final int EDGE_LEFT = 1;
    private static final int EDGE_RIGHT = 2;
    public static final int KEYCODE_SHIFT = -1;
    public static final int KEYCODE_MODE_CHANGE = -2;
    public static final int KEYCODE_ENTER = -4;
    public static final int KEYCODE_DELETE = -5;
    public static final int KEYCODE_SPACE = 32;
    public static final int KEYCODE_EMOJI = -6;
    public static final boolean VIBRATE_ON_KEYPRESS = true;
    public static final boolean SHOW_POPUP_ON_KEYPRESS = true;
    public static final int SHIFT_OFF = 0;
    public static final int SHIFT_ON_ONE_CHAR = 1;
    public static final int SHIFT_ON_PERMANENT = 2;
    public static final int MAX_KEYS_PER_MINI_ROW = 9;
    public static final int ITEM_SECTION_LABEL = 0;
    public static final int ITEM_CLIP = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMOJI_SPEC_FILE_PATH = "media/emoji_spec.txt";
    
    public final float getMKeyboardHeightMultiplier() {
        return 0.0F;
    }
    
    public final void setMKeyboardHeightMultiplier(float p0) {
    }
    
    public final int getMShiftState() {
        return 0;
    }
    
    public final void setMShiftState(int p0) {
    }
    
    public final int getMHeight() {
        return 0;
    }
    
    public final void setMHeight(int p0) {
    }
    
    public final int getMMinWidth() {
        return 0;
    }
    
    public final void setMMinWidth(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> getMKeys() {
        return null;
    }
    
    public final void setMKeys(@org.jetbrains.annotations.Nullable()
    java.util.List<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> p0) {
    }
    
    /**
     * Creates a keyboard from the given xml key layout file. Weeds out rows that have a keyboard mode defined but don't match the specified mode.
     * @param context the application or service context
     * @param xmlLayoutResId the resource file that contains the keyboard layout and keys.
     * @param enterKeyType determines what icon should we show on Enter key
     */
    @kotlin.jvm.JvmOverloads()
    public ItemMainKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.XmlRes()
    int xmlLayoutResId, int enterKeyType) {
        super();
    }
    
    /**
     * Creates a blank keyboard from the given resource file and populates it with the specified characters in left-to-right, top-to-bottom fashion,
     * using the specified number of columns. If the specified number of columns is -1, then the keyboard will fit as many keys as possible in each row.
     * @param context the application or service context
     * @param layoutTemplateResId the layout template file, containing no keys.
     * @param characters the list of characters to display on the keyboard. One key will be created for each character.
     * @param keyWidth the width of the popup key, make sure it is the same as the key itself
     */
    public ItemMainKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int layoutTemplateResId, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence characters, int keyWidth) {
        super();
    }
    
    public final boolean setShifted(int shiftState) {
        return false;
    }
    
    private final com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Row createRowFromXml(android.content.res.Resources res, android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    private final com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key createKeyFromXml(android.content.res.Resources res, com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Row parent, int x, int y, android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void loadKeyboard(android.content.Context context, android.content.res.XmlResourceParser parser) {
    }
    
    private final void parseKeyboardAttributes(android.content.res.Resources res, android.content.res.XmlResourceParser parser) {
    }
    
    private final float getKeyboardHeightMultiplier() {
        return 0.0F;
    }
    
    /**
     * Container for keys in the keyboard. All keys in a row are at the same Y-coordinate. Some of the key size defaults can be overridden per row from
     * what the [ItemMainKeyboard] defines.
     * @attr ref android.R.styleable#Keyboard_keyWidth
     * @attr ref android.R.styleable#Keyboard_horizontalGap
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0004\u00a8\u0006 "}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Row;", "", "parent", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "(Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;)V", "res", "Landroid/content/res/Resources;", "parser", "Landroid/content/res/XmlResourceParser;", "(Landroid/content/res/Resources;Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;Landroid/content/res/XmlResourceParser;)V", "defaultHeight", "", "getDefaultHeight", "()I", "setDefaultHeight", "(I)V", "defaultHorizontalGap", "getDefaultHorizontalGap", "setDefaultHorizontalGap", "defaultWidth", "getDefaultWidth", "setDefaultWidth", "mKeys", "Ljava/util/ArrayList;", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Key;", "getMKeys", "()Ljava/util/ArrayList;", "setMKeys", "(Ljava/util/ArrayList;)V", "getParent", "()Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "setParent", "desiemoji_debug"})
    public static final class Row {
        
        /**
         * Default width of a key in this row.
         */
        private int defaultWidth = 0;
        
        /**
         * Default height of a key in this row.
         */
        private int defaultHeight = 0;
        
        /**
         * Default horizontal gap between keys in this row.
         */
        private int defaultHorizontalGap = 0;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> mKeys;
        @org.jetbrains.annotations.NotNull()
        private com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard parent;
        
        public final int getDefaultWidth() {
            return 0;
        }
        
        public final void setDefaultWidth(int p0) {
        }
        
        public final int getDefaultHeight() {
            return 0;
        }
        
        public final void setDefaultHeight(int p0) {
        }
        
        public final int getDefaultHorizontalGap() {
            return 0;
        }
        
        public final void setDefaultHorizontalGap(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> getMKeys() {
            return null;
        }
        
        public final void setMKeys(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard getParent() {
            return null;
        }
        
        public final void setParent(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard p0) {
        }
        
        public Row(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard parent) {
            super();
        }
        
        public Row(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources res, @org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard parent, @org.jetbrains.annotations.Nullable()
        android.content.res.XmlResourceParser parser) {
            super();
        }
    }
    
    /**
     * Class for describing the position and characteristics of a single key in the keyboard.
     *
     * @attr ref android.R.styleable#Keyboard_keyWidth
     * @attr ref android.R.styleable#Keyboard_keyHeight
     * @attr ref android.R.styleable#Keyboard_horizontalGap
     * @attr ref android.R.styleable#Keyboard_Key_codes
     * @attr ref android.R.styleable#Keyboard_Key_keyIcon
     * @attr ref android.R.styleable#Keyboard_Key_keyLabel
     * @attr ref android.R.styleable#Keyboard_Key_isRepeatable
     * @attr ref android.R.styleable#Keyboard_Key_popupKeyboard
     * @attr ref android.R.styleable#Keyboard_Key_popupCharacters
     * @attr ref android.R.styleable#Keyboard_Key_keyEdgeFlags
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\u0016\u0010F\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018R\u001a\u00106\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011\u00a8\u0006G"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Key;", "", "res", "Landroid/content/res/Resources;", "parent", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Row;", "x", "", "y", "parser", "Landroid/content/res/XmlResourceParser;", "(Landroid/content/res/Resources;Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Row;IILandroid/content/res/XmlResourceParser;)V", "(Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Row;)V", "code", "getCode", "()I", "setCode", "(I)V", "edgeFlags", "focused", "", "getFocused", "()Z", "setFocused", "(Z)V", "gap", "getGap", "setGap", "height", "getHeight", "setHeight", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "keyboard", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "popupCharacters", "getPopupCharacters", "setPopupCharacters", "popupResId", "getPopupResId", "setPopupResId", "pressed", "getPressed", "setPressed", "repeatable", "getRepeatable", "setRepeatable", "topSmallNumber", "", "getTopSmallNumber", "()Ljava/lang/String;", "setTopSmallNumber", "(Ljava/lang/String;)V", "width", "getWidth", "setWidth", "getX", "setX", "getY", "setY", "isInside", "desiemoji_debug"})
    public static final class Key {
        
        /**
         * Key code that this key generates.
         */
        private int code = 0;
        
        /**
         * Label to display
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.CharSequence label = "";
        
        /**
         * First row of letters can also be used for inserting numbers by long pressing them, show those numbers
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String topSmallNumber = "";
        
        /**
         * Icon to display instead of a label. Icon takes precedence over a label
         */
        @org.jetbrains.annotations.Nullable()
        private android.graphics.drawable.Drawable icon;
        
        /**
         * Width of the key, not including the gap
         */
        private int width;
        
        /**
         * Height of the key, not including the gap
         */
        private int height;
        
        /**
         * The horizontal gap before this key
         */
        private int gap;
        
        /**
         * X coordinate of the key in the keyboard layout
         */
        private int x = 0;
        
        /**
         * Y coordinate of the key in the keyboard layout
         */
        private int y = 0;
        
        /**
         * The current pressed state of this key
         */
        private boolean pressed = false;
        
        /**
         * Focused state, used after long pressing a key and swiping to alternative keys
         */
        private boolean focused = false;
        
        /**
         * Popup characters showing after long pressing the key
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.CharSequence popupCharacters;
        
        /**
         * Flags that specify the anchoring to edges of the keyboard for detecting touch events that are just out of the boundary of the key.
         * This is a bit mask of [ItemMainKeyboard.EDGE_LEFT], [ItemMainKeyboard.EDGE_RIGHT].
         */
        private int edgeFlags = 0;
        
        /**
         * The keyboard that this key belongs to
         */
        private final com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard keyboard = null;
        
        /**
         * If this key pops up a mini keyboard, this is the resource id for the XML layout for that keyboard.
         */
        private int popupResId = 0;
        
        /**
         * Whether this key repeats itself when held down
         */
        private boolean repeatable = false;
        
        public Key(@org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Row parent) {
            super();
        }
        
        public final int getCode() {
            return 0;
        }
        
        public final void setCode(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence getLabel() {
            return null;
        }
        
        public final void setLabel(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTopSmallNumber() {
            return null;
        }
        
        public final void setTopSmallNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.drawable.Drawable getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable p0) {
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final void setWidth(int p0) {
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final void setHeight(int p0) {
        }
        
        public final int getGap() {
            return 0;
        }
        
        public final void setGap(int p0) {
        }
        
        public final int getX() {
            return 0;
        }
        
        public final void setX(int p0) {
        }
        
        public final int getY() {
            return 0;
        }
        
        public final void setY(int p0) {
        }
        
        public final boolean getPressed() {
            return false;
        }
        
        public final void setPressed(boolean p0) {
        }
        
        public final boolean getFocused() {
            return false;
        }
        
        public final void setFocused(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getPopupCharacters() {
            return null;
        }
        
        public final void setPopupCharacters(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence p0) {
        }
        
        public final int getPopupResId() {
            return 0;
        }
        
        public final void setPopupResId(int p0) {
        }
        
        public final boolean getRepeatable() {
            return false;
        }
        
        public final void setRepeatable(boolean p0) {
        }
        
        /**
         * Create a key with the given top-left coordinate and extract its attributes from the XML parser.
         * @param res resources associated with the caller's context
         * @param parent the row that this key belongs to. The row must already be attached to a [ItemMainKeyboard].
         * @param x the x coordinate of the top-left
         * @param y the y coordinate of the top-left
         * @param parser the XML parser containing the attributes for this key
         */
        public Key(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources res, @org.jetbrains.annotations.NotNull()
        com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Row parent, int x, int y, @org.jetbrains.annotations.Nullable()
        android.content.res.XmlResourceParser parser) {
            super();
        }
        
        /**
         * Detects if a point falls inside this key.
         * @param x the x-coordinate of the point
         * @param y the y-coordinate of the point
         * @return whether or not the point falls inside the key. If the key is attached to an edge, it will assume that all points between the key and
         * the edge are considered to be inside the key.
         */
        public final boolean isInside(int x, int y) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Companion;", "", "()V", "EDGE_LEFT", "", "EDGE_RIGHT", "EMOJI_SPEC_FILE_PATH", "", "ITEM_CLIP", "ITEM_SECTION_LABEL", "KEYCODE_DELETE", "KEYCODE_EMOJI", "KEYCODE_ENTER", "KEYCODE_MODE_CHANGE", "KEYCODE_SHIFT", "KEYCODE_SPACE", "MAX_KEYS_PER_MINI_ROW", "SHIFT_OFF", "SHIFT_ON_ONE_CHAR", "SHIFT_ON_PERMANENT", "SHOW_POPUP_ON_KEYPRESS", "", "TAG_KEY", "TAG_KEYBOARD", "TAG_ROW", "VIBRATE_ON_KEYPRESS", "getDimensionOrFraction", "a", "Landroid/content/res/TypedArray;", "index", "base", "defValue", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getDimensionOrFraction(@org.jetbrains.annotations.NotNull()
        android.content.res.TypedArray a, int index, int base, int defValue) {
            return 0;
        }
    }
}