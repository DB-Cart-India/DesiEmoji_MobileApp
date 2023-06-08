package com.desiemoji.keyboard.di.hilt;

import com.desiemoji.keyboard.data.local.autotext.AutoTextDao;
import com.desiemoji.keyboard.data.local.db.AppDatabase;
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
public final class DatabaseModule_ProvideAutoTextDaoFactory implements Factory<AutoTextDao> {
  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvideAutoTextDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AutoTextDao get() {
    return provideAutoTextDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideAutoTextDaoFactory create(
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideAutoTextDaoFactory(databaseProvider);
  }

  public static AutoTextDao provideAutoTextDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAutoTextDao(database));
  }
}
