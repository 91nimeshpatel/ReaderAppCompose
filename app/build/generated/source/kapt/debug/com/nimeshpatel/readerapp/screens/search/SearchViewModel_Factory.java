// Generated by Dagger (https://dagger.dev).
package com.nimeshpatel.readerapp.screens.search;

import com.nimeshpatel.readerapp.repository.BookRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<BookRepository> repositoryProvider;

  public SearchViewModel_Factory(Provider<BookRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<BookRepository> repositoryProvider) {
    return new SearchViewModel_Factory(repositoryProvider);
  }

  public static SearchViewModel newInstance(BookRepository repository) {
    return new SearchViewModel(repository);
  }
}
