package com.nimeshpatel.readerapp.ui.theme;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u00a2\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u001aY\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001aY\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001a\u001aY\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001a\u001a2\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"CommonInputField", "", "modifier", "Landroidx/compose/ui/Modifier;", "value", "", "onValueChange", "Lkotlin/Function1;", "label", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "trailingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "isSingleLine", "", "EmailInputField", "maxLength", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "EmailInputField-BhUwt6o", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/foundation/text/KeyboardActions;)V", "PasswordInputField", "PasswordInputField-BhUwt6o", "SearchInputField", "SearchInputField-BhUwt6o", "SubmitButton", "text", "isLoading", "isValidInput", "onClick", "app_debug"})
public final class CommonUiKt {
    
    /**
     * Created by Nimesh Patel on 01-Dec-24.
     * Purpose:
     */
    @androidx.compose.runtime.Composable
    public static final void CommonInputField(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull
    java.lang.String label, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.text.input.VisualTransformation visualTransformation, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingIcon, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.text.KeyboardOptions keyboardOptions, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean isSingleLine) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SubmitButton(@org.jetbrains.annotations.NotNull
    java.lang.String text, boolean isLoading, boolean isValidInput, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}