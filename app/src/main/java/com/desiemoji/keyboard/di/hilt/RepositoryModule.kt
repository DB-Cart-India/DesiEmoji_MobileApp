package com.desiemoji.keyboard.di.hilt

import com.desiemoji.keyboard.di.*
import com.desiemoji.keyboard.repository.autotext.AutoTextRepository
import com.desiemoji.keyboard.repository.autotext.AutoTextRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module(includes = [
    NetworkModule::class,
    ServiceModule::class,
    DatabaseModule::class,
    UtilModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun getAutoTextRepository(repository: AutoTextRepositoryImpl): AutoTextRepository

}