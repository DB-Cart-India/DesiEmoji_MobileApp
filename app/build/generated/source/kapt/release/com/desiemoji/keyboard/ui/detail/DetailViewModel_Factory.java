package com.desiemoji.keyboard.ui.detail;

import com.desiemoji.keyboard.repository.autotext.AutoTextRepository;
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
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<AutoTextRepository> repositoryProvider;

  public DetailViewModel_Factory(Provider<AutoTextRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static DetailViewModel_Factory create(Provider<AutoTextRepository> repositoryProvider) {
    return new DetailViewModel_Factory(repositoryProvider);
  }

  public static DetailViewModel newInstance(AutoTextRepository repository) {
    return new DetailViewModel(repository);
  }
}
