package com.nimeshpatel.readerapp.component;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.Toast;
import androidx.compose.animation.core.Spring;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import com.nimeshpatel.readerapp.model.MBook;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a*\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a$\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a.\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a,\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00122\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001a4\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001a\u001a\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0007\u001a\u0016\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n\u00a8\u0006$"}, d2 = {"BookRating", "", "score", "", "HorizontalScrollComponent", "books", "", "Lcom/nimeshpatel/readerapp/model/MBook;", "onCardPress", "Lkotlin/Function1;", "", "ListCard", "mBook", "onPress", "RatingBar", "modifier", "Landroidx/compose/ui/Modifier;", "rating", "", "onPressRating", "RoundedButton", "label", "radius", "Lkotlin/Function0;", "ShowAlertDialog", "title", "message", "openDialog", "Landroidx/compose/runtime/MutableState;", "", "onYesPress", "TitleSection", "showToast", "context", "Landroid/content/Context;", "msg", "app_debug"})
public final class ComponentsKt {
    
    /**
     * Created by Nimesh Patel on 19-Dec-24.
     * Purpose:
     */
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void RoundedButton(@org.jetbrains.annotations.NotNull
    java.lang.String label, int radius, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPress) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TitleSection(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String label) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HorizontalScrollComponent(@org.jetbrains.annotations.NotNull
    java.util.List<com.nimeshpatel.readerapp.model.MBook> books, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCardPress) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ListCard(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.MBook mBook, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPress) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BookRating(@org.jetbrains.annotations.NotNull
    java.lang.Number score) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    @androidx.compose.runtime.Composable
    public static final void RatingBar(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, int rating, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPressRating) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ShowAlertDialog(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> openDialog, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onYesPress) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
}