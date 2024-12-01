package com.nimeshpatel.readerapp.screens.home;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseAuth;
import com.nimeshpatel.readerapp.data.DataOrException;
import com.nimeshpatel.readerapp.model.MBook;
import com.nimeshpatel.readerapp.repository.FireRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000f\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cJ\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0019H\u0002J6\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\"0!2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cR0\u0010\u0007\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/nimeshpatel/readerapp/screens/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/nimeshpatel/readerapp/repository/FireRepository;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/nimeshpatel/readerapp/repository/FireRepository;Lcom/google/firebase/auth/FirebaseAuth;)V", "_data", "Landroidx/compose/runtime/MutableState;", "Lcom/nimeshpatel/readerapp/data/DataOrException;", "", "Lcom/nimeshpatel/readerapp/model/MBook;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "currentUserName", "", "getCurrentUserName", "()Ljava/lang/String;", "<set-?>", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "listOfBooks", "getListOfBooks", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "deleteBookById", "", "mBook", "onSuccess", "Lkotlin/Function0;", "fetchBookByUser", "getAllBooksFromDatabase", "updateBookById", "bookToUpdate", "", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.repository.FireRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.nimeshpatel.readerapp.model.MBook> listOfBooks;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currentUserName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.nimeshpatel.readerapp.data.DataOrException<java.util.List<com.nimeshpatel.readerapp.model.MBook>, java.lang.Boolean, java.lang.Exception>> _data = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.repository.FireRepository repository, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.nimeshpatel.readerapp.model.MBook> getListOfBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentUserName() {
        return null;
    }
    
    private final void getAllBooksFromDatabase() {
    }
    
    public final void fetchBookByUser() {
    }
    
    public final void deleteBookById(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook mBook, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
    
    public final void updateBookById(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook mBook, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Comparable<?>> bookToUpdate, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
}