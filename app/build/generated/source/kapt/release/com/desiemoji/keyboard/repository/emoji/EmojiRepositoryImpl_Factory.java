package com.desiemoji.keyboard.repository.emoji;

import com.desiemoji.keyboard.data.local.emoji.EmojiDao;
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
public final class EmojiRepositoryImpl_Factory implements Factory<EmojiRepositoryImpl> {
  private final Provider<EmojiDao> daoProvider;

  public EmojiRepositoryImpl_Factory(Provider<EmojiDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public EmojiRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static EmojiRepositoryImpl_Factory create(Provider<EmojiDao> daoProvider) {
    return new EmojiRepositoryImpl_Factory(daoProvider);
  }

  public static EmojiRepositoryImpl newInstance(EmojiDao dao) {
    return new EmojiRepositoryImpl(dao);
  }
}
