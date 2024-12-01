package com.nimeshpatel.readerapp.model;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010!J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u000b\u0010H\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005H\u00c6\u0003J\u00a8\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010ZJ\t\u0010[\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\\\u001a\u00020\u00032\b\u0010]\u001a\u0004\u0018\u00010^H\u00d6\u0003J\t\u0010_\u001a\u00020\u0015H\u00d6\u0001J\t\u0010`\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u0015H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b>\u00106R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010+\u00a8\u0006f"}, d2 = {"Lcom/nimeshpatel/readerapp/model/VolumeInfo;", "Landroid/os/Parcelable;", "allowAnonLogging", "", "authors", "", "", "averageRating", "", "canonicalVolumeLink", "categories", "contentVersion", "description", "imageLinks", "Lcom/nimeshpatel/readerapp/model/ImageLinks;", "industryIdentifiers", "Lcom/nimeshpatel/readerapp/model/IndustryIdentifier;", "infoLink", "language", "maturityRating", "pageCount", "", "panelizationSummary", "Lcom/nimeshpatel/readerapp/model/PanelizationSummary;", "previewLink", "printType", "publishedDate", "publisher", "ratingsCount", "readingModes", "Lcom/nimeshpatel/readerapp/model/ReadingModes;", "subtitle", "title", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/nimeshpatel/readerapp/model/ImageLinks;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nimeshpatel/readerapp/model/PanelizationSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nimeshpatel/readerapp/model/ReadingModes;Ljava/lang/String;Ljava/lang/String;)V", "getAllowAnonLogging", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAuthors", "()Ljava/util/List;", "getAverageRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCanonicalVolumeLink", "()Ljava/lang/String;", "getCategories", "getContentVersion", "getDescription", "getImageLinks", "()Lcom/nimeshpatel/readerapp/model/ImageLinks;", "getIndustryIdentifiers", "getInfoLink", "getLanguage", "getMaturityRating", "getPageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPanelizationSummary", "()Lcom/nimeshpatel/readerapp/model/PanelizationSummary;", "getPreviewLink", "getPrintType", "getPublishedDate", "getPublisher", "getRatingsCount", "getReadingModes", "()Lcom/nimeshpatel/readerapp/model/ReadingModes;", "getSubtitle", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/nimeshpatel/readerapp/model/ImageLinks;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nimeshpatel/readerapp/model/PanelizationSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/nimeshpatel/readerapp/model/ReadingModes;Ljava/lang/String;Ljava/lang/String;)Lcom/nimeshpatel/readerapp/model/VolumeInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class VolumeInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean allowAnonLogging = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> authors = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double averageRating = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String canonicalVolumeLink = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String contentVersion = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final com.nimeshpatel.readerapp.model.ImageLinks imageLinks = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.nimeshpatel.readerapp.model.IndustryIdentifier> industryIdentifiers = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String infoLink = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String language = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String maturityRating = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer pageCount = null;
    @org.jetbrains.annotations.Nullable
    private final com.nimeshpatel.readerapp.model.PanelizationSummary panelizationSummary = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String previewLink = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String printType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String publishedDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String publisher = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer ratingsCount = null;
    @org.jetbrains.annotations.Nullable
    private final com.nimeshpatel.readerapp.model.ReadingModes readingModes = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String subtitle = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    
    public VolumeInfo(@org.jetbrains.annotations.Nullable
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable
    java.lang.Double averageRating, @org.jetbrains.annotations.Nullable
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable
    java.util.List<com.nimeshpatel.readerapp.model.IndustryIdentifier> industryIdentifiers, @org.jetbrains.annotations.Nullable
    java.lang.String infoLink, @org.jetbrains.annotations.Nullable
    java.lang.String language, @org.jetbrains.annotations.Nullable
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.Nullable
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable
    java.lang.String printType, @org.jetbrains.annotations.Nullable
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable
    java.lang.String publisher, @org.jetbrains.annotations.Nullable
    java.lang.Integer ratingsCount, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.ReadingModes readingModes, @org.jetbrains.annotations.Nullable
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAllowAnonLogging() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getAuthors() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getAverageRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCanonicalVolumeLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContentVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.ImageLinks getImageLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nimeshpatel.readerapp.model.IndustryIdentifier> getIndustryIdentifiers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInfoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMaturityRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.PanelizationSummary getPanelizationSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPreviewLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPrintType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRatingsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.ReadingModes getReadingModes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public VolumeInfo() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.PanelizationSummary component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.ReadingModes component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.nimeshpatel.readerapp.model.ImageLinks component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.nimeshpatel.readerapp.model.IndustryIdentifier> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.VolumeInfo copy(@org.jetbrains.annotations.Nullable
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable
    java.lang.Double averageRating, @org.jetbrains.annotations.Nullable
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable
    java.util.List<com.nimeshpatel.readerapp.model.IndustryIdentifier> industryIdentifiers, @org.jetbrains.annotations.Nullable
    java.lang.String infoLink, @org.jetbrains.annotations.Nullable
    java.lang.String language, @org.jetbrains.annotations.Nullable
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.Nullable
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable
    java.lang.String printType, @org.jetbrains.annotations.Nullable
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable
    java.lang.String publisher, @org.jetbrains.annotations.Nullable
    java.lang.Integer ratingsCount, @org.jetbrains.annotations.Nullable
    com.nimeshpatel.readerapp.model.ReadingModes readingModes, @org.jetbrains.annotations.Nullable
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable
    java.lang.String title) {
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