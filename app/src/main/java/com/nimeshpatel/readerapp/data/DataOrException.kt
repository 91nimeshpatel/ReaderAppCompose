package com.nimeshpatel.readerapp.data

/**
 * Created by Nimesh Patel on 10-Dec-24.
 * Purpose:
 */
data class DataOrException<T, Boolean, E : Exception?>(
    var data: T? = null,
    var loading: Boolean? = null,
    var e: E? = null
)
