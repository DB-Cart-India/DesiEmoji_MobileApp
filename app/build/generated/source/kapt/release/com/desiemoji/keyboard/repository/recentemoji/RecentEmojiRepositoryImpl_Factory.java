package com.desiemoji.keyboard.repository.recentemoji;

import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao;
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
public final class RecentEmojiRepositoryImpl_Factory implements Factory<RecentEmojiRepositoryImpl> {
  private final Provider<RecentEmojiDao> daoProvider;

  public RecentEmojiRepositoryImpl_Factory(Provider<RecentEmojiDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public RecentEmojiRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static RecentEmojiRepositoryImpl_Factory create(Provider<RecentEmojiDao> daoProvider) {
    return new RecentEmojiRepositoryImpl_Factory(daoProvider);
  }

  public static RecentEmojiRepositoryImpl newInstance(RecentEmojiDao dao) {
    return new RecentEmojiRepositoryImpl(dao);
  }
}
