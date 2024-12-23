package com.nimeshpatel.readerapp.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SaleInfo(
    val buyLink: String,
    val country: String,
    val isEbook: Boolean,
    val listPrice: ListPrice,
    val offers: List<Offer>,
    val retailPrice: RetailPriceX,
    val saleability: String
) : Parcelable