package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class RetailPrice(
    val amountInMicros: Long,
    val currencyCode: String
) : Parcelable