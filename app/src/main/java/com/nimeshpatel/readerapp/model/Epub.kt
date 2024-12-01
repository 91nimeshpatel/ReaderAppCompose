package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Epub(
    val acsTokenLink: String,
    val isAvailable: Boolean
) : Parcelable