package com.nimeshpatel.readerapp.repository

import com.nimeshpatel.readerapp.interfaces.BooksApi
import com.nimeshpatel.readerapp.model.Item
import com.nimeshpatel.readerapp.utils.Resource
import javax.inject.Inject

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
class BookRepository @Inject constructor(
    private val api: BooksApi
) {
    suspend fun getBooks(searchQuery: String): Resource<List<Item>> {
        return try {
            val itemList = api.getAllBooks(searchQuery).items

            Resource.Success(data = itemList)
        } catch (e: Exception) {
            Resource.Error(message = e.message.toString())
        }
    }

    suspend fun getBookInfo(bookId: String): Resource<Item> {
        val response = try {
            Resource.Loading(data = true)
            api.getBookInfo(bookId = bookId)
        } catch (e: Exception) {
            return Resource.Error("An Error occurred")
        }
        Resource.Loading(data = false)
        return Resource.Success(response)
    }

}