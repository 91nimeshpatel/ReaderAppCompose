// Generated by Dagger (https://dagger.dev).
package com.nimeshpatel.readerapp.repository;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class FireRepository_Factory implements Factory<FireRepository> {
  private final Provider<FirebaseFirestore> firebaseFirestoreProvider;

  public FireRepository_Factory(Provider<FirebaseFirestore> firebaseFirestoreProvider) {
    this.firebaseFirestoreProvider = firebaseFirestoreProvider;
  }

  @Override
  public FireRepository get() {
    return newInstance(firebaseFirestoreProvider.get());
  }

  public static FireRepository_Factory create(
      Provider<FirebaseFirestore> firebaseFirestoreProvider) {
    return new FireRepository_Factory(firebaseFirestoreProvider);
  }

  public static FireRepository newInstance(FirebaseFirestore firebaseFirestore) {
    return new FireRepository(firebaseFirestore);
  }
}
