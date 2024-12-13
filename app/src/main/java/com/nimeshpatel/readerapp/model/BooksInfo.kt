package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class BooksInfo(
    val items: List<Item>,
    val kind: String,
    val totalItems: Int
) : Parcelable