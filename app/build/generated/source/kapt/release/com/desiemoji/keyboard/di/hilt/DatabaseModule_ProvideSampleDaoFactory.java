package com.desiemoji.keyboard.di.hilt;

import com.desiemoji.keyboard.data.local.db.AppDatabase;
import com.desiemoji.keyboard.data.local.sample.SampleDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideSampleDaoFactory implements Factory<SampleDao> {
  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvideSampleDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SampleDao get() {
    return provideSampleDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideSampleDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideSampleDaoFactory(databaseProvider);
  }

  public static SampleDao provideSampleDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideSampleDao(database));
  }
}
