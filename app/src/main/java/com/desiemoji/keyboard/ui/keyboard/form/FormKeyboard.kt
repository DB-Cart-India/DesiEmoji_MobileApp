package com.desiemoji.keyboard.ui.keyboard.form

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import com.desiemoji.keyboard.common.base.BaseKeyboard
import com.desiemoji.keyboard.databinding.KeyboardFormBinding


class FormKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardFormBinding>(context, attrs) {

    override fun setupViewBinding(): KeyboardFormBinding {
        return KeyboardFormBinding.inflate(LayoutInflater.from(context), this, true)
    }

    override fun onCreate() {
        initView()
    }

    private fun initView() {
        binding?.apply {
            Log.d("FormKeyboard", "initView: ${etText.onCreateInputConnection(EditorInfo())}")
        }
    }

}