package com.nimeshpatel.readerapp.model;

import kotlinx.parcelize.Parcelize;
import android.os.Parcelable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020$H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006/"}, d2 = {"Lcom/nimeshpatel/readerapp/model/SaleInfo;", "Landroid/os/Parcelable;", "buyLink", "", "country", "isEbook", "", "listPrice", "Lcom/nimeshpatel/readerapp/model/ListPrice;", "offers", "", "Lcom/nimeshpatel/readerapp/model/Offer;", "retailPrice", "Lcom/nimeshpatel/readerapp/model/RetailPriceX;", "saleability", "(Ljava/lang/String;Ljava/lang/String;ZLcom/nimeshpatel/readerapp/model/ListPrice;Ljava/util/List;Lcom/nimeshpatel/readerapp/model/RetailPriceX;Ljava/lang/String;)V", "getBuyLink", "()Ljava/lang/String;", "getCountry", "()Z", "getListPrice", "()Lcom/nimeshpatel/readerapp/model/ListPrice;", "getOffers", "()Ljava/util/List;", "getRetailPrice", "()Lcom/nimeshpatel/readerapp/model/RetailPriceX;", "getSaleability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class SaleInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String buyLink = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    private final boolean isEbook = false;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.ListPrice listPrice = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.nimeshpatel.readerapp.model.Offer> offers = null;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.RetailPriceX retailPrice = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String saleability = null;
    
    public SaleInfo(@org.jetbrains.annotations.NotNull
    java.lang.String buyLink, @org.jetbrains.annotations.NotNull
    java.lang.String country, boolean isEbook, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.ListPrice listPrice, @org.jetbrains.annotations.NotNull
    java.util.List<com.nimeshpatel.readerapp.model.Offer> offers, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.RetailPriceX retailPrice, @org.jetbrains.annotations.NotNull
    java.lang.String saleability) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBuyLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final boolean isEbook() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.ListPrice getListPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.nimeshpatel.readerapp.model.Offer> getOffers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.RetailPriceX getRetailPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSaleability() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.ListPrice component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.nimeshpatel.readerapp.model.Offer> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.RetailPriceX component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.SaleInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String buyLink, @org.jetbrains.annotations.NotNull
    java.lang.String country, boolean isEbook, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.ListPrice listPrice, @org.jetbrains.annotations.NotNull
    java.util.List<com.nimeshpatel.readerapp.model.Offer> offers, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.RetailPriceX retailPrice, @org.jetbrains.annotations.NotNull
    java.lang.String saleability) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
}