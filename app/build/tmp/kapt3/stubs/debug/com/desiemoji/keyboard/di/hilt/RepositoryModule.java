package com.desiemoji.keyboard.di.hilt;

import java.lang.System;

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/desiemoji/keyboard/di/hilt/RepositoryModule;", "", "()V", "getAutoTextRepository", "Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepository;", "repository", "Lcom/desiemoji/keyboard/repository/autotext/AutoTextRepositoryImpl;", "desiemoji_debug"})
@dagger.Module(includes = {com.desiemoji.keyboard.di.hilt.NetworkModule.class, com.desiemoji.keyboard.di.hilt.ServiceModule.class, com.desiemoji.keyboard.di.hilt.DatabaseModule.class, com.desiemoji.keyboard.di.hilt.UtilModule.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.desiemoji.keyboard.repository.autotext.AutoTextRepository getAutoTextRepository(@org.jetbrains.annotations.NotNull()
    com.desiemoji.keyboard.repository.autotext.AutoTextRepositoryImpl repository);
}