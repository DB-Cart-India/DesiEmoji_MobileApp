package com.desiemoji.keyboard.di.koin

import com.desiemoji.keyboard.data.local.db.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val databaseModule = module {

    single {
        AppDatabase.newInstance(androidContext()).autoTextDao()
    }


}