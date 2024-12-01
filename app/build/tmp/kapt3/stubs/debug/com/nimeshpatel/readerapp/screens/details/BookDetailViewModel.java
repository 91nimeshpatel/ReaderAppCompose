package com.nimeshpatel.readerapp.screens.details;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.nimeshpatel.readerapp.model.Item;
import com.nimeshpatel.readerapp.model.VolumeInfo;
import com.nimeshpatel.readerapp.repository.BookRepository;
import com.nimeshpatel.readerapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/nimeshpatel/readerapp/screens/details/BookDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/nimeshpatel/readerapp/repository/BookRepository;", "firebaseFireStore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/nimeshpatel/readerapp/repository/BookRepository;Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "getBookInfo", "Lcom/nimeshpatel/readerapp/utils/Resource;", "Lcom/nimeshpatel/readerapp/model/Item;", "bookId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBookInfo", "", "bookData", "Lcom/nimeshpatel/readerapp/model/VolumeInfo;", "googleBookId", "processAction", "Lkotlin/Function1;", "Companion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class BookDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.repository.BookRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFireStore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    public static final com.nimeshpatel.readerapp.screens.details.BookDetailViewModel.Companion Companion = null;
    
    @javax.inject.Inject
    public BookDetailViewModel(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.repository.BookRepository repository, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFireStore, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBookInfo(@org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.utils.Resource<com.nimeshpatel.readerapp.model.Item>> $completion) {
        return null;
    }
    
    public final void saveBookInfo(@org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.VolumeInfo bookData, @org.jetbrains.annotations.Nullable
    java.lang.String googleBookId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> processAction) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nimeshpatel/readerapp/screens/details/BookDetailViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}