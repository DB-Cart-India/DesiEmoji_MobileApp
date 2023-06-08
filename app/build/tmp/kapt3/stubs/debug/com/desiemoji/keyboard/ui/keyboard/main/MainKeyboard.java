package com.desiemoji.keyboard.ui.keyboard.main;

import java.lang.System;

@android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "ClickableViewAccessibility"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020]H\u0002J\b\u0010_\u001a\u00020`H\u0002J\u0012\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010%H\u0002J(\u0010c\u001a\u00020`2\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u0018H\u0002J\b\u0010h\u001a\u00020`H\u0002J\u0018\u0010i\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002J\u0006\u0010j\u001a\u00020`J\u0010\u0010k\u001a\u00020`2\u0006\u0010l\u001a\u00020\u0007H\u0002J\b\u0010m\u001a\u00020\nH\u0002J\b\u0010n\u001a\u00020`H\u0015J\b\u0010o\u001a\u00020`H\u0003J\b\u0010p\u001a\u00020`H\u0016J\u0010\u0010q\u001a\u00020`2\u0006\u0010r\u001a\u00020\u0012H\u0016J\u0018\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020)2\u0006\u0010u\u001a\u00020vH\u0002J\u0018\u0010w\u001a\u00020`2\u0006\u0010x\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u0007H\u0016J\u0010\u0010z\u001a\u00020\n2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010{\u001a\u00020\n2\u0006\u0010u\u001a\u00020vH\u0016J\u0018\u0010|\u001a\u00020`2\u0006\u0010}\u001a\u00020\u00012\u0006\u0010~\u001a\u00020\u0007H\u0015J\u0010\u0010\u007f\u001a\u00020\n2\u0006\u0010u\u001a\u00020vH\u0002J\t\u0010\u0080\u0001\u001a\u00020`H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\nH\u0002J\u001b\u0010\u0083\u0001\u001a\u00020`2\u0007\u0010\u0084\u0001\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u0007H\u0002J\u000f\u0010\u0086\u0001\u001a\u00020`2\u0006\u0010b\u001a\u00020%J\u0019\u0010\u0087\u0001\u001a\u00020`2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020`2\u0007\u0010\u0089\u0001\u001a\u00020\u0007H\u0002J\u0011\u0010\u008a\u0001\u001a\u00020`2\u0006\u0010l\u001a\u00020\u0007H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020`2\u0006\u0010l\u001a\u00020\u0007H\u0002J\u0007\u0010\u008c\u0001\u001a\u00020`R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008e\u0001"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/MainKeyboard;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ignoreTouches", "", "mAbortKey", "mAccessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "mBackgroundColor", "mBuffer", "Landroid/graphics/Bitmap;", "mCanvas", "Landroid/graphics/Canvas;", "mCoordinates", "", "mCurrentKey", "mCurrentKeyIndex", "mCurrentKeyTime", "", "mDirtyRect", "Landroid/graphics/Rect;", "mDownTime", "mDrawPending", "mHandler", "Landroid/os/Handler;", "mIsLongPressingSpace", "mKeyBackground", "Landroid/graphics/drawable/Drawable;", "mKeyIndices", "mKeyTextSize", "mKeyboard", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard;", "mKeyboardChanged", "mKeys", "Ljava/util/ArrayList;", "Lcom/desiemoji/keyboard/ui/keyboard/main/ItemMainKeyboard$Key;", "mLabelTextSize", "mLastCodeX", "mLastCodeY", "mLastKey", "mLastKeyTime", "mLastMoveTime", "mLastSpaceMoveX", "mLastTapTime", "mLastX", "mLastY", "mMiniKeyboard", "mMiniKeyboardCache", "", "mMiniKeyboardContainer", "mMiniKeyboardOffsetX", "mMiniKeyboardOffsetY", "mMiniKeyboardOnScreen", "mMiniKeyboardSelectedKeyIndex", "mOnKeyboardActionListener", "Lcom/desiemoji/keyboard/ui/keyboard/main/OnKeyboardActionListener;", "getMOnKeyboardActionListener", "()Lcom/desiemoji/keyboard/ui/keyboard/main/OnKeyboardActionListener;", "setMOnKeyboardActionListener", "(Lcom/desiemoji/keyboard/ui/keyboard/main/OnKeyboardActionListener;)V", "mPaint", "Landroid/graphics/Paint;", "mPopupKeyboard", "Landroid/widget/PopupWindow;", "mPopupLayout", "mPopupMaxMoveDistance", "", "mPopupParent", "mPopupPreviewX", "mPopupPreviewY", "mPopupX", "mPopupY", "mPreviewHeight", "mPreviewPopup", "mPreviewText", "Landroid/widget/TextView;", "mPreviewTextSizeLarge", "mPrimaryColor", "mProximityThreshold", "mRepeatKeyIndex", "mSpaceMoveThreshold", "mTextColor", "mTopSmallNumberMarginHeight", "mTopSmallNumberMarginWidth", "mTopSmallNumberSize", "mVerticalCorrection", "adjustCase", "", "label", "closing", "", "computeProximityThreshold", "keyboard", "detectAndSendKey", "index", "x", "y", "eventTime", "dismissPopupKeyboard", "getPressedKeyIndex", "invalidateAllKeys", "invalidateKey", "keyIndex", "isShifted", "onAttachedToWindow", "onBufferDraw", "onDetachedFromWindow", "onDraw", "canvas", "onLongPress", "popupKey", "me", "Landroid/view/MotionEvent;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onModifiedTouchEvent", "onTouchEvent", "onVisibilityChanged", "changedView", "visibility", "openPopupIfRequired", "removeMessages", "repeatKey", "initialCall", "sendAccessibilityEventForUnicodeCharacter", "eventType", "code", "setKeyboard", "setPopupOffset", "setShifted", "shiftState", "showKey", "showPreview", "vibrateIfNeeded", "Companion", "desiemoji_debug"})
public final class MainKeyboard extends android.view.View {
    private com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard mKeyboard;
    private int mCurrentKeyIndex = -1;
    private int mLabelTextSize = 0;
    private int mKeyTextSize = 0;
    private int mTextColor = 0;
    private int mBackgroundColor = 0;
    private int mPrimaryColor = 0;
    private android.widget.TextView mPreviewText;
    private final android.widget.PopupWindow mPreviewPopup = null;
    private int mPreviewTextSizeLarge = 0;
    private int mPreviewHeight = 0;
    private final int[] mCoordinates = null;
    private final android.widget.PopupWindow mPopupKeyboard = null;
    private android.view.View mMiniKeyboardContainer;
    private com.desiemoji.keyboard.ui.keyboard.main.MainKeyboard mMiniKeyboard;
    private boolean mMiniKeyboardOnScreen = false;
    private android.view.View mPopupParent;
    private int mMiniKeyboardOffsetX = 0;
    private int mMiniKeyboardOffsetY = 0;
    private final java.util.Map<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key, android.view.View> mMiniKeyboardCache = null;
    private java.util.ArrayList<com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key> mKeys;
    private int mMiniKeyboardSelectedKeyIndex = -1;
    @org.jetbrains.annotations.Nullable()
    private com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener mOnKeyboardActionListener;
    private int mVerticalCorrection = 0;
    private int mProximityThreshold = 0;
    private int mPopupPreviewX = 0;
    private int mPopupPreviewY = 0;
    private int mLastX = 0;
    private int mLastY = 0;
    private final android.graphics.Paint mPaint = null;
    private long mDownTime = 0L;
    private long mLastMoveTime = 0L;
    private int mLastKey = 0;
    private int mLastCodeX = 0;
    private int mLastCodeY = 0;
    private int mCurrentKey = -1;
    private long mLastKeyTime = 0L;
    private long mCurrentKeyTime = 0L;
    private final int[] mKeyIndices = null;
    private int mPopupX = 0;
    private int mPopupY = 0;
    private int mRepeatKeyIndex = -1;
    private int mPopupLayout = 0;
    private boolean mAbortKey = false;
    private boolean mIsLongPressingSpace = false;
    private int mLastSpaceMoveX = 0;
    private float mPopupMaxMoveDistance = 0.0F;
    private float mTopSmallNumberSize = 0.0F;
    private float mTopSmallNumberMarginWidth = 0.0F;
    private float mTopSmallNumberMarginHeight = 0.0F;
    private final int mSpaceMoveThreshold = 0;
    private boolean ignoreTouches = false;
    private android.graphics.drawable.Drawable mKeyBackground;
    private long mLastTapTime = 0L;
    
    /**
     * Whether the keyboard bitmap needs to be redrawn before it's blitted.
     */
    private boolean mDrawPending = false;
    
    /**
     * The dirty region in the keyboard bitmap
     */
    private final android.graphics.Rect mDirtyRect = null;
    
    /**
     * The keyboard bitmap for faster updates
     */
    private android.graphics.Bitmap mBuffer;
    
    /**
     * Notes if the keyboard just changed, so that we could possibly reallocate the mBuffer.
     */
    private boolean mKeyboardChanged = false;
    
    /**
     * The canvas for the above mutable keyboard bitmap
     */
    private android.graphics.Canvas mCanvas;
    
    /**
     * The accessibility manager for accessibility support
     */
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private android.os.Handler mHandler;
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.ui.keyboard.main.MainKeyboard.Companion Companion = null;
    private static final int NOT_A_KEY = -1;
    private static final int[] LONG_PRESSABLE_STATE_SET = {com.desiemoji.keyboard.R.attr.state_long_pressable};
    private static final int MSG_REMOVE_PREVIEW = 1;
    private static final int MSG_REPEAT = 2;
    private static final int MSG_LONGPRESS = 3;
    private static final int DELAY_AFTER_PREVIEW = 100;
    private static final int DEBOUNCE_TIME = 70;
    private static final int REPEAT_INTERVAL = 50;
    private static final int REPEAT_START_DELAY = 400;
    private static final int LONGPRESS_TIMEOUT = 0;
    
    @kotlin.jvm.JvmOverloads()
    public MainKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MainKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleRes) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener getMOnKeyboardActionListener() {
        return null;
    }
    
    public final void setMOnKeyboardActionListener(@org.jetbrains.annotations.Nullable()
    com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener p0) {
    }
    
    @android.annotation.SuppressLint(value = {"HandlerLeak"})
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onVisibilityChanged(@org.jetbrains.annotations.NotNull()
    android.view.View changedView, int visibility) {
    }
    
    /**
     * Attaches a keyboard to this view. The keyboard can be switched at any time and the view will re-layout itself to accommodate the keyboard.
     * @param keyboard the keyboard to display in this view
     */
    public final void setKeyboard(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard keyboard) {
    }
    
    public final void vibrateIfNeeded() {
    }
    
    /**
     * Sets the state of the shift key of the keyboard, if any.
     * @param shifted whether or not to enable the state of the shift key
     * @return true if the shift key state changed, false if there was no change
     */
    private final void setShifted(int shiftState) {
    }
    
    /**
     * Returns the state of the shift key of the keyboard, if any.
     * @return true if the shift is in a pressed state, false otherwise
     */
    private final boolean isShifted() {
        return false;
    }
    
    private final void setPopupOffset(int x, int y) {
    }
    
    private final java.lang.CharSequence adjustCase(java.lang.CharSequence label) {
        return null;
    }
    
    @java.lang.Override()
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    /**
     * Compute the average distance between adjacent keys (horizontally and vertically) and square it to get the proximity threshold. We use a square here and
     * in computing the touch distance from a key's center to avoid taking a square root.
     * @param keyboard
     */
    private final void computeProximityThreshold(com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard keyboard) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void onBufferDraw() {
    }
    
    private final int getPressedKeyIndex(int x, int y) {
        return 0;
    }
    
    private final void detectAndSendKey(int index, int x, int y, long eventTime) {
    }
    
    private final void showPreview(int keyIndex) {
    }
    
    private final void showKey(int keyIndex) {
    }
    
    private final void sendAccessibilityEventForUnicodeCharacter(int eventType, int code) {
    }
    
    /**
     * Requests a redraw of the entire keyboard. Calling [.invalidate] is not sufficient because the keyboard renders the keys to an off-screen buffer and
     * an invalidate() only draws the cached buffer.
     */
    public final void invalidateAllKeys() {
    }
    
    /**
     * Invalidates a key so that it will be redrawn on the next repaint. Use this method if only one key is changing it's content. Any changes that
     * affect the position or size of the key may not be honored.
     * @param keyIndex the index of the key in the attached [ItemMainKeyboard].
     */
    private final void invalidateKey(int keyIndex) {
    }
    
    private final boolean openPopupIfRequired(android.view.MotionEvent me) {
        return false;
    }
    
    /**
     * Called when a key is long pressed. By default this will open any popup keyboard associated with this key through the attributes
     * popupLayout and popupCharacters.
     * @param popupKey the key that was long pressed
     * @return true if the long press is handled, false otherwise. Subclasses should call the method on the base class if the subclass doesn't wish to
     * handle the call.
     */
    private final boolean onLongPress(com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Key popupKey, android.view.MotionEvent me) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent me) {
        return false;
    }
    
    private final boolean onModifiedTouchEvent(android.view.MotionEvent me) {
        return false;
    }
    
    private final boolean repeatKey(boolean initialCall) {
        return false;
    }
    
    private final void closing() {
    }
    
    private final void removeMessages() {
    }
    
    @java.lang.Override()
    public void onDetachedFromWindow() {
    }
    
    private final void dismissPopupKeyboard() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/desiemoji/keyboard/ui/keyboard/main/MainKeyboard$Companion;", "", "()V", "DEBOUNCE_TIME", "", "DELAY_AFTER_PREVIEW", "LONGPRESS_TIMEOUT", "LONG_PRESSABLE_STATE_SET", "", "MSG_LONGPRESS", "MSG_REMOVE_PREVIEW", "MSG_REPEAT", "NOT_A_KEY", "REPEAT_INTERVAL", "REPEAT_START_DELAY", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}