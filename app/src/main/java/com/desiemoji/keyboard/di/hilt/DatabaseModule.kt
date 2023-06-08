package com.desiemoji.keyboard.di.hilt

import android.content.Context
import com.desiemoji.keyboard.data.local.autotext.AutoTextDao
import com.desiemoji.keyboard.data.local.db.AppDatabase
import com.desiemoji.keyboard.data.local.sample.SampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return AppDatabase.newInstance(appContext)
    }

    @Provides
    fun provideSampleDao(database: AppDatabase): SampleDao {
        return database.sampleDao()
    }

    @Provides
    fun provideAutoTextDao(database: AppDatabase): AutoTextDao {
        return database.autoTextDao()
    }

}