package com.nimeshpatel.readerapp.screens.search;

import android.util.Log;
import androidx.compose.runtime.*;
import androidx.lifecycle.ViewModel;
import com.nimeshpatel.readerapp.model.Item;
import com.nimeshpatel.readerapp.repository.BookRepository;
import com.nimeshpatel.readerapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/nimeshpatel/readerapp/screens/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/nimeshpatel/readerapp/repository/BookRepository;", "(Lcom/nimeshpatel/readerapp/repository/BookRepository;)V", "<set-?>", "", "Lcom/nimeshpatel/readerapp/model/Item;", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list$delegate", "Landroidx/compose/runtime/MutableState;", "loadBooks", "", "searchBooks", "query", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.repository.BookRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState list$delegate = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.repository.BookRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.nimeshpatel.readerapp.model.Item> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.nimeshpatel.readerapp.model.Item> p0) {
    }
    
    private final void loadBooks() {
    }
    
    public final void searchBooks(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
}