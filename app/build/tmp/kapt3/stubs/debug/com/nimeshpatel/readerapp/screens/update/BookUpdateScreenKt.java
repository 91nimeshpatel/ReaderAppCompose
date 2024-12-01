package com.nimeshpatel.readerapp.screens.update;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.NavController;
import com.google.firebase.Timestamp;
import com.nimeshpatel.readerapp.R;
import com.nimeshpatel.readerapp.model.MBook;
import com.nimeshpatel.readerapp.navigation.ReaderScreens;
import com.nimeshpatel.readerapp.screens.home.HomeViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\nH\u0007\u001a \u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a0\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"BookUpdateScreen", "", "navController", "Landroidx/navigation/NavController;", "bookItemId", "", "homeViewModel", "Lcom/nimeshpatel/readerapp/screens/home/HomeViewModel;", "CardListItem", "book", "Lcom/nimeshpatel/readerapp/model/MBook;", "onPressDetails", "Lkotlin/Function0;", "ShowBookUpdate", "bookInfo", "ShowSimpleForm", "SimpleForm", "modifier", "Landroidx/compose/ui/Modifier;", "defaultValue", "onSearch", "Lkotlin/Function1;", "app_debug"})
public final class BookUpdateScreenKt {
    
    /**
     * Created by Nimesh Patel on 01-Dec-24.
     * Purpose:
     */
    @androidx.compose.runtime.Composable
    public static final void BookUpdateScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    java.lang.String bookItemId, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ShowSimpleForm(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook book, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SimpleForm(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearch) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ShowBookUpdate(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook bookInfo) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CardListItem(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook book, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPressDetails) {
    }
}