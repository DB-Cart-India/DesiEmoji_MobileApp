package com.desiemoji.keyboard.ui.keyboard.webview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.desiemoji.keyboard.common.base.BaseKeyboard
import com.desiemoji.keyboard.databinding.KeyboardWebviewBinding
import com.frogobox.sdk.ext.loadUrlExt


class WebiewKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardWebviewBinding>(context, attrs) {

    override fun setupViewBinding(): KeyboardWebviewBinding {
        return KeyboardWebviewBinding.inflate(LayoutInflater.from(context), this, true)
    }

    override fun onCreate() {
        initView()
    }

    private fun initView() {
        binding?.apply {
            webview.loadUrlExt("https://www.google.com")
        }
    }

}