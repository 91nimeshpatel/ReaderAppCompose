package com.nimeshpatel.readerapp.model;

import kotlinx.parcelize.Parcelize;
import android.os.Parcelable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\'H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\'H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00063"}, d2 = {"Lcom/nimeshpatel/readerapp/model/Item;", "Landroid/os/Parcelable;", "accessInfo", "Lcom/nimeshpatel/readerapp/model/AccessInfo;", "etag", "", "id", "kind", "saleInfo", "Lcom/nimeshpatel/readerapp/model/SaleInfo;", "searchInfo", "Lcom/nimeshpatel/readerapp/model/SearchInfo;", "selfLink", "volumeInfo", "Lcom/nimeshpatel/readerapp/model/VolumeInfo;", "(Lcom/nimeshpatel/readerapp/model/AccessInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nimeshpatel/readerapp/model/SaleInfo;Lcom/nimeshpatel/readerapp/model/SearchInfo;Ljava/lang/String;Lcom/nimeshpatel/readerapp/model/VolumeInfo;)V", "getAccessInfo", "()Lcom/nimeshpatel/readerapp/model/AccessInfo;", "getEtag", "()Ljava/lang/String;", "getId", "getKind", "getSaleInfo", "()Lcom/nimeshpatel/readerapp/model/SaleInfo;", "getSearchInfo", "()Lcom/nimeshpatel/readerapp/model/SearchInfo;", "getSelfLink", "getVolumeInfo", "()Lcom/nimeshpatel/readerapp/model/VolumeInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class Item implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.AccessInfo accessInfo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String etag = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String kind = null;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.SaleInfo saleInfo = null;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.SearchInfo searchInfo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String selfLink = null;
    @org.jetbrains.annotations.Nullable
    private final com.nimeshpatel.readerapp.model.VolumeInfo volumeInfo = null;
    
    public Item(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.AccessInfo accessInfo, @org.jetbrains.annotations.NotNull
    java.lang.String etag, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String kind, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.SaleInfo saleInfo, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.SearchInfo searchInfo, @org.jetbrains.annotations.NotNull
    java.lang.String selfLink, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.VolumeInfo volumeInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.AccessInfo getAccessInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEtag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.SaleInfo getSaleInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.SearchInfo getSearchInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelfLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.VolumeInfo getVolumeInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.AccessInfo component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.SaleInfo component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.SearchInfo component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.VolumeInfo component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.Item copy(@org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.AccessInfo accessInfo, @org.jetbrains.annotations.NotNull
    java.lang.String etag, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String kind, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.SaleInfo saleInfo, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.SearchInfo searchInfo, @org.jetbrains.annotations.NotNull
    java.lang.String selfLink, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.VolumeInfo volumeInfo) {
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