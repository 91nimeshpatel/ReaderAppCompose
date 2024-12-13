package com.nimeshpatel.readerapp.utils

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
sealed class Resource<T>(val data:T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data:T? = null) : Resource<T>(data,message)
    class Loading<T>(data: T? = null): Resource<T>(data)
}