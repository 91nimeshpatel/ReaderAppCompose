package com.nimeshpatel.readerapp.interfaces;

import com.nimeshpatel.readerapp.model.BooksInfo;
import com.nimeshpatel.readerapp.model.Item;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import javax.inject.Singleton;

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/nimeshpatel/readerapp/interfaces/BooksApi;", "", "getAllBooks", "Lcom/nimeshpatel/readerapp/model/BooksInfo;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBookInfo", "Lcom/nimeshpatel/readerapp/model/Item;", "bookId", "app_debug"})
public abstract interface BooksApi {
    
    @retrofit2.http.GET(value = "volumes")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllBooks(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.model.BooksInfo> $completion);
    
    @retrofit2.http.GET(value = "volumes/{bookId}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBookInfo(@retrofit2.http.Path(value = "bookId")
    @org.jetbrains.annotations.NotNull
    java.lang.String bookId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.nimeshpatel.readerapp.model.Item> $completion);
}