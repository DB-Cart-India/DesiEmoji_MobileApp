package com.desiemoji.keyboard.di.hilt

import android.content.Context
import com.desiemoji.keyboard.util.Constant.PREF_ROOT_NAME
import com.frogobox.sdk.delegate.preference.PreferenceDelegates
import com.frogobox.sdk.delegate.preference.PreferenceDelegatesImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UtilModule {

    @Provides
    @Singleton
    fun providePreferenceDelegates(@ApplicationContext context: Context): PreferenceDelegates {
        return PreferenceDelegatesImpl(context, PREF_ROOT_NAME)
    }

}