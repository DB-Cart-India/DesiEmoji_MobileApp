package com.desiemoji.keyboard.di.koin

import com.desiemoji.keyboard.ui.autotext.AutoTextViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {

    viewModel {
        AutoTextViewModel(get())
    }

}