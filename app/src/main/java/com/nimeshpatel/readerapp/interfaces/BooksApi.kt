package com.nimeshpatel.readerapp.interfaces

import com.nimeshpatel.readerapp.model.BooksInfo
import com.nimeshpatel.readerapp.model.Item
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@Singleton
interface BooksApi {

    @GET("volumes")
    suspend fun getAllBooks(@Query("q") query: String): BooksInfo

    @GET("volumes/{bookId}")
    suspend fun getBookInfo(@Path("bookId") bookId: String): Item
}