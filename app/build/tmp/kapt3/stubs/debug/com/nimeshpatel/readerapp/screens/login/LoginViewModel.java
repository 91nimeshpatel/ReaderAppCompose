package com.nimeshpatel.readerapp.screens.login;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.nimeshpatel.readerapp.model.MUser;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/nimeshpatel/readerapp/screens/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseFireStore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "_loading", "Landroidx/lifecycle/MutableLiveData;", "", "loading", "Landroidx/lifecycle/LiveData;", "getLoading", "()Landroidx/lifecycle/LiveData;", "setLoading", "(Landroidx/lifecycle/LiveData;)V", "createUser", "", "displayName", "", "email", "password", "home", "Lkotlin/Function0;", "loginUser", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFireStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.lang.Boolean> loading;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth auth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFireStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> home) {
    }
    
    private final void createUser(java.lang.String displayName) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> home) {
        return null;
    }
}