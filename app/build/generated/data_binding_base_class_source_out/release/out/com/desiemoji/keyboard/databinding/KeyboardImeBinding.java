// Generated by view binder compiler. Do not edit!
package com.desiemoji.keyboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.desiemoji.keyboard.R;
import com.desiemoji.keyboard.ui.keyboard.emoji.EmojiKeyboard;
import com.desiemoji.keyboard.ui.keyboard.main.MainKeyboard;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class KeyboardImeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout containerKeyboardMain;

  @NonNull
  public final EmojiKeyboard keyboardEmoji;

  @NonNull
  public final ConstraintLayout keyboardHolder;

  @NonNull
  public final MainKeyboard keyboardMain;

  @NonNull
  public final LinearLayout mockMeasureHeightKeyboard;

  @NonNull
  public final MainKeyboard mockMeasureHeightKeyboardMain;

  private KeyboardImeBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout containerKeyboardMain, @NonNull EmojiKeyboard keyboardEmoji,
      @NonNull ConstraintLayout keyboardHolder, @NonNull MainKeyboard keyboardMain,
      @NonNull LinearLayout mockMeasureHeightKeyboard,
      @NonNull MainKeyboard mockMeasureHeightKeyboardMain) {
    this.rootView = rootView;
    this.containerKeyboardMain = containerKeyboardMain;
    this.keyboardEmoji = keyboardEmoji;
    this.keyboardHolder = keyboardHolder;
    this.keyboardMain = keyboardMain;
    this.mockMeasureHeightKeyboard = mockMeasureHeightKeyboard;
    this.mockMeasureHeightKeyboardMain = mockMeasureHeightKeyboardMain;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static KeyboardImeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static KeyboardImeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.keyboard_ime, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static KeyboardImeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_keyboard_main;
      LinearLayout containerKeyboardMain = ViewBindings.findChildViewById(rootView, id);
      if (containerKeyboardMain == null) {
        break missingId;
      }

      id = R.id.keyboard_emoji;
      EmojiKeyboard keyboardEmoji = ViewBindings.findChildViewById(rootView, id);
      if (keyboardEmoji == null) {
        break missingId;
      }

      ConstraintLayout keyboardHolder = (ConstraintLayout) rootView;

      id = R.id.keyboard_main;
      MainKeyboard keyboardMain = ViewBindings.findChildViewById(rootView, id);
      if (keyboardMain == null) {
        break missingId;
      }

      id = R.id.mock_measure_height_keyboard;
      LinearLayout mockMeasureHeightKeyboard = ViewBindings.findChildViewById(rootView, id);
      if (mockMeasureHeightKeyboard == null) {
        break missingId;
      }

      id = R.id.mock_measure_height_keyboard_main;
      MainKeyboard mockMeasureHeightKeyboardMain = ViewBindings.findChildViewById(rootView, id);
      if (mockMeasureHeightKeyboardMain == null) {
        break missingId;
      }

      return new KeyboardImeBinding((ConstraintLayout) rootView, containerKeyboardMain,
          keyboardEmoji, keyboardHolder, keyboardMain, mockMeasureHeightKeyboard,
          mockMeasureHeightKeyboardMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
