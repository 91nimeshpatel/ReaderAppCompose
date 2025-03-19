package com.nimeshpatel.readerapp.screens.home;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.NavController;
import com.google.firebase.auth.FirebaseAuth;
import com.nimeshpatel.readerapp.R;
import com.nimeshpatel.readerapp.navigation.ReaderScreens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\"\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0011"}, d2 = {"BookListArea", "", "navController", "Landroidx/navigation/NavController;", "homeViewModel", "Lcom/nimeshpatel/readerapp/screens/home/HomeViewModel;", "FABContent", "onTap", "Lkotlin/Function1;", "", "HomeAppBar", "title", "showProfile", "", "HomeContent", "HomeScreen", "ReadingRightNowArea", "app_debug"})
public final class HomeScreenKt {
    
    /**
     * Created by Nimesh Patel on 01-Dec-24.
     * Purpose:
     */
    @androidx.compose.runtime.Composable
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FABContent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTap) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HomeContent(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BookListArea(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ReadingRightNowArea(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void HomeAppBar(@org.jetbrains.annotations.NotNull
    java.lang.String title, boolean showProfile, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
}