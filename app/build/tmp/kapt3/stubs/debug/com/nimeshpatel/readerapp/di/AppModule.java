package com.nimeshpatel.readerapp.di;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.ktx.Firebase;
import com.nimeshpatel.readerapp.interfaces.BooksApi;
import com.nimeshpatel.readerapp.repository.FireRepository;
import com.nimeshpatel.readerapp.utils.Constants;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

/**
 * Created by Nimesh Patel on 08-Dec-24.
 * Purpose:
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/nimeshpatel/readerapp/di/AppModule;", "", "()V", "provideBookApi", "Lcom/nimeshpatel/readerapp/interfaces/BooksApi;", "provideFireBookRepository", "Lcom/nimeshpatel/readerapp/repository/FireRepository;", "firebaseFireStore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideFirebaseFireStore", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.nimeshpatel.readerapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.FirebaseFirestore provideFirebaseFireStore() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.interfaces.BooksApi provideBookApi() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.repository.FireRepository provideFireBookRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFireStore) {
        return null;
    }
}