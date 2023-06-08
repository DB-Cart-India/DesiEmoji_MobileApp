package com.desiemoji.keyboard.ui.autotext;

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
public final class AutoTextViewModel_Factory implements Factory<AutoTextViewModel> {
  private final Provider<AutoTextRepository> repositoryProvider;

  public AutoTextViewModel_Factory(Provider<AutoTextRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AutoTextViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AutoTextViewModel_Factory create(Provider<AutoTextRepository> repositoryProvider) {
    return new AutoTextViewModel_Factory(repositoryProvider);
  }

  public static AutoTextViewModel newInstance(AutoTextRepository repository) {
    return new AutoTextViewModel(repository);
  }
}
