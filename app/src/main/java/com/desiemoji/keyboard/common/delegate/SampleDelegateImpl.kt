package com.desiemoji.keyboard.common.delegate

class SampleDelegateImpl : SampleDelegate {

    override fun getTagMainDelegate(): String {
        return SampleDelegateImpl::class.java.simpleName
    }

}