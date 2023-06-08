package com.desiemoji.keyboard.ui.main;

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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<AutoTextRepository> repositoryProvider;

  public MainViewModel_Factory(Provider<AutoTextRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<AutoTextRepository> repositoryProvider) {
    return new MainViewModel_Factory(repositoryProvider);
  }

  public static MainViewModel newInstance(AutoTextRepository repository) {
    return new MainViewModel(repository);
  }
}
