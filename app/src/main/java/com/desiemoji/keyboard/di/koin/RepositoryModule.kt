package com.desiemoji.keyboard.di.koin

import com.desiemoji.keyboard.repository.autotext.AutoTextRepositoryImpl
import org.koin.dsl.module



val repositoryModule = module {

    single {
        AutoTextRepositoryImpl(get())
    }


}