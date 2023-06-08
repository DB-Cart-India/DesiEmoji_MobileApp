package com.desiemoji.keyboard.repository.autotext;

import com.desiemoji.keyboard.data.local.autotext.AutoTextDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AutoTextRepositoryImpl_Factory implements Factory<AutoTextRepositoryImpl> {
  private final Provider<AutoTextDao> daoProvider;

  public AutoTextRepositoryImpl_Factory(Provider<AutoTextDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public AutoTextRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static AutoTextRepositoryImpl_Factory create(Provider<AutoTextDao> daoProvider) {
    return new AutoTextRepositoryImpl_Factory(daoProvider);
  }

  public static AutoTextRepositoryImpl newInstance(AutoTextDao dao) {
    return new AutoTextRepositoryImpl(dao);
  }
}
