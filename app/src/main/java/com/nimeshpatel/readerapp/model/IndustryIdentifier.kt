package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class IndustryIdentifier(
    val identifier: String,
    val type: String
) : Parcelable