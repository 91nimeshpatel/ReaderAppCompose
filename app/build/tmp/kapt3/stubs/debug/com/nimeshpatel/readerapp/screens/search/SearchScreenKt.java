package com.nimeshpatel.readerapp.screens.search;

import android.annotation.SuppressLint;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.navigation.NavController;
import com.nimeshpatel.readerapp.R;
import com.nimeshpatel.readerapp.model.Item;
import com.nimeshpatel.readerapp.navigation.ReaderScreens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a(\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a&\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0011"}, d2 = {"BookList", "", "navController", "Landroidx/navigation/NavController;", "searchViewModel", "Lcom/nimeshpatel/readerapp/screens/search/SearchViewModel;", "BookRow", "item", "Lcom/nimeshpatel/readerapp/model/Item;", "SearchForm", "modifier", "Landroidx/compose/ui/Modifier;", "onSearch", "Lkotlin/Function1;", "", "SearchScreen", "label", "app_debug"})
public final class SearchScreenKt {
    
    /**
     * Created by Nimesh Patel on 01-Dec-24.
     * Purpose:
     */
    @androidx.compose.runtime.Composable
    public static final void SearchScreen(@org.jetbrains.annotations.NotNull
    java.lang.String label, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.search.SearchViewModel searchViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BookList(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.screens.search.SearchViewModel searchViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BookRow(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.Item item, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SearchForm(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearch) {
    }
}