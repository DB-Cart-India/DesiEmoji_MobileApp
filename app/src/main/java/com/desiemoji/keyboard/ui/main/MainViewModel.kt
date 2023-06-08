package com.desiemoji.keyboard.ui.main

import com.desiemoji.keyboard.common.base.BaseViewModel
import com.desiemoji.keyboard.repository.autotext.AutoTextRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: AutoTextRepository
): BaseViewModel() {


}