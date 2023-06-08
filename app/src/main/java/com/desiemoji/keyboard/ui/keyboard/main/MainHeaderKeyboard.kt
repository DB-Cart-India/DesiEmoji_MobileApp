package com.desiemoji.keyboard.ui.keyboard.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.desiemoji.keyboard.common.base.BaseKeyboard
import com.desiemoji.keyboard.databinding.KeyboardMainHeaderBinding


class MainHeaderKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardMainHeaderBinding>(context, attrs) {

    override fun setupViewBinding(): KeyboardMainHeaderBinding {
        return KeyboardMainHeaderBinding.inflate(LayoutInflater.from(context), this, true)
    }

    override fun onCreate() {

    }

}