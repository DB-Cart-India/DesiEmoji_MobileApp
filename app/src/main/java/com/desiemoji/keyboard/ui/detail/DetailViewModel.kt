package com.desiemoji.keyboard.ui.detail

import com.desiemoji.keyboard.common.base.BaseViewModel
import com.desiemoji.keyboard.repository.autotext.AutoTextRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DetailViewModel @Inject constructor(
    private val repository: AutoTextRepository
): BaseViewModel() {


}