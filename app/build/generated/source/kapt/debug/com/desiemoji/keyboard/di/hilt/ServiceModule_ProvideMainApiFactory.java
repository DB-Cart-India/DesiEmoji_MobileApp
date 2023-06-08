package com.desiemoji.keyboard.di.hilt;

import android.content.Context;
import com.desiemoji.keyboard.data.remote.sample.SampleApi;
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
public final class ServiceModule_ProvideMainApiFactory implements Factory<SampleApi> {
  private final ServiceModule module;

  private final Provider<Context> contextProvider;

  public ServiceModule_ProvideMainApiFactory(ServiceModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SampleApi get() {
    return provideMainApi(module, contextProvider.get());
  }

  public static ServiceModule_ProvideMainApiFactory create(ServiceModule module,
      Provider<Context> contextProvider) {
    return new ServiceModule_ProvideMainApiFactory(module, contextProvider);
  }

  public static SampleApi provideMainApi(ServiceModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainApi(context));
  }
}
