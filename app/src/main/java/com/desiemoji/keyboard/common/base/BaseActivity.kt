package com.desiemoji.keyboard.common.base

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.desiemoji.keyboard.BuildConfig
import com.frogobox.sdk.view.FrogoBindActivity

abstract class BaseActivity<VB: ViewBinding> : FrogoBindActivity<VB>() {

    open fun initView() {}

    override fun setupDebugMode(): Boolean {
        return BuildConfig.DEBUG
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        super.onCreateExt(savedInstanceState)
        initView()
    }

}