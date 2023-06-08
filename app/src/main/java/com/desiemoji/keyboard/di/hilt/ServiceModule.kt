package com.desiemoji.keyboard.di.hilt

import android.content.Context
import com.desiemoji.keyboard.data.remote.sample.SampleApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    @Singleton
    fun provideMainApi(@ApplicationContext context: Context): SampleApi {
        return SampleApi.Creator().newInstance(context, "https://armorycodes.github.io/android-research-tech-pro/")
    }

}