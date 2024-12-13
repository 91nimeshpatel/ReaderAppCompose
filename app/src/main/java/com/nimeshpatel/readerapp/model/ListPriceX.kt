package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ListPriceX(
    val amountInMicros: Long,
    val currencyCode: String
) : Parcelable