package com.desiemoji.keyboard.repository.subcategory;

import com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao;
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
public final class SubCategoryRepositoryImpl_Factory implements Factory<SubCategoryRepositoryImpl> {
  private final Provider<SubCategoryDao> daoProvider;

  public SubCategoryRepositoryImpl_Factory(Provider<SubCategoryDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public SubCategoryRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static SubCategoryRepositoryImpl_Factory create(Provider<SubCategoryDao> daoProvider) {
    return new SubCategoryRepositoryImpl_Factory(daoProvider);
  }

  public static SubCategoryRepositoryImpl newInstance(SubCategoryDao dao) {
    return new SubCategoryRepositoryImpl(dao);
  }
}
