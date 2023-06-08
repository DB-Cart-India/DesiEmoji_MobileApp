package com.desiemoji.keyboard.di.hilt;

import android.content.Context;
import com.frogobox.sdk.delegate.preference.PreferenceDelegates;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class UtilModule_ProvidePreferenceDelegatesFactory implements Factory<PreferenceDelegates> {
  private final UtilModule module;

  private final Provider<Context> contextProvider;

  public UtilModule_ProvidePreferenceDelegatesFactory(UtilModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceDelegates get() {
    return providePreferenceDelegates(module, contextProvider.get());
  }

  public static UtilModule_ProvidePreferenceDelegatesFactory create(UtilModule module,
      Provider<Context> contextProvider) {
    return new UtilModule_ProvidePreferenceDelegatesFactory(module, contextProvider);
  }

  public static PreferenceDelegates providePreferenceDelegates(UtilModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providePreferenceDelegates(context));
  }
}
