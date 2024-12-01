package com.nimeshpatel.readerapp.repository;

import com.nimeshpatel.readerapp.interfaces.BooksApi;
import com.nimeshpatel.readerapp.model.Item;
import com.nimeshpatel.readerapp.utils.Resource;
import javax.inject.Inject;

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00062\u0006\u0010\r\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/nimeshpatel/readerapp/repository/BookRepository;", "", "api", "Lcom/nimeshpatel/readerapp/interfaces/BooksApi;", "(Lcom/nimeshpatel/readerapp/interfaces/BooksApi;)V", "getBookInfo", "Lcom/nimeshpatel/readerapp/utils/Resource;", "Lcom/nimeshpatel/readerapp/model/Item;", "bookId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBooks", "", "searchQuery", "app_debug"})
public final class BookRepository {
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.interfaces.BooksApi api = null;
    
    @javax.inject.Inject
    public BookRepository(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.interfaces.BooksApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBooks(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.utils.Resource<java.util.List<com.nimeshpatel.readerapp.model.Item>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBookInfo(@org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.utils.Resource<com.nimeshpatel.readerapp.model.Item>> $completion) {
        return null;
    }
}