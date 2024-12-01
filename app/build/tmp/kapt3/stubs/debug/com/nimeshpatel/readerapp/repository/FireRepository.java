package com.nimeshpatel.readerapp.repository;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.nimeshpatel.readerapp.data.DataOrException;
import com.nimeshpatel.readerapp.model.MBook;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0010j\u0002`\u00110\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J3\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/nimeshpatel/readerapp/repository/FireRepository;", "", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "booksCollection", "Lcom/google/firebase/firestore/CollectionReference;", "deleteBookById", "", "bookId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBooksFromDatabase", "Lcom/nimeshpatel/readerapp/data/DataOrException;", "", "Lcom/nimeshpatel/readerapp/model/MBook;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBookById", "bookToUpdate", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FireRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.CollectionReference booksCollection = null;
    
    @javax.inject.Inject
    public FireRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllBooksFromDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.data.DataOrException<java.util.List<com.nimeshpatel.readerapp.model.MBook>, java.lang.Boolean, java.lang.Exception>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteBookById(@org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateBookById(@org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Comparable<?>> bookToUpdate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}