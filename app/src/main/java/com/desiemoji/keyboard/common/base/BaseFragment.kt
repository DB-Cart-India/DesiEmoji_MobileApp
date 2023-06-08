package com.desiemoji.keyboard.common.base

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.frogobox.sdk.view.FrogoBindFragment

abstract class BaseFragment<VB: ViewBinding> : FrogoBindFragment<VB>() {

    open fun initView() {}

    override fun onViewCreatedExt(view: View, savedInstanceState: Bundle?) {
        super.onViewCreatedExt(view, savedInstanceState)
        initView()
    }

}