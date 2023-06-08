package com.desiemoji.keyboard.di.koin

import com.desiemoji.keyboard.util.Constant.PREF_ROOT_NAME
import com.frogobox.sdk.delegate.preference.PreferenceDelegatesImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val delegateModule = module {

    single {
        PreferenceDelegatesImpl(androidContext(), PREF_ROOT_NAME)
    }

}
