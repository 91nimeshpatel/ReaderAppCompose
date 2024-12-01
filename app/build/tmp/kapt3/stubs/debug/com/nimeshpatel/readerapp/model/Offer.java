package com.nimeshpatel.readerapp.model;

import kotlinx.parcelize.Parcelize;
import android.os.Parcelable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/nimeshpatel/readerapp/model/Offer;", "Landroid/os/Parcelable;", "finskyOfferType", "", "listPrice", "Lcom/nimeshpatel/readerapp/model/ListPriceX;", "retailPrice", "Lcom/nimeshpatel/readerapp/model/RetailPrice;", "(ILcom/nimeshpatel/readerapp/model/ListPriceX;Lcom/nimeshpatel/readerapp/model/RetailPrice;)V", "getFinskyOfferType", "()I", "getListPrice", "()Lcom/nimeshpatel/readerapp/model/ListPriceX;", "getRetailPrice", "()Lcom/nimeshpatel/readerapp/model/RetailPrice;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class Offer implements android.os.Parcelable {
    private final int finskyOfferType = 0;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.ListPriceX listPrice = null;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.RetailPrice retailPrice = null;
    
    public Offer(int finskyOfferType, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.ListPriceX listPrice, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.RetailPrice retailPrice) {
        super();
    }
    
    public final int getFinskyOfferType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.ListPriceX getListPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.RetailPrice getRetailPrice() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.ListPriceX component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.RetailPrice component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.Offer copy(int finskyOfferType, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.ListPriceX listPrice, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.RetailPrice retailPrice) {
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