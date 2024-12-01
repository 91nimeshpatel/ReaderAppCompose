package com.nimeshpatel.readerapp.model;

import kotlinx.parcelize.Parcelize;
import android.os.Parcelable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\t\u0010*\u001a\u00020+H\u00d6\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020+H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u00066"}, d2 = {"Lcom/nimeshpatel/readerapp/model/AccessInfo;", "Landroid/os/Parcelable;", "accessViewStatus", "", "country", "embeddable", "", "epub", "Lcom/nimeshpatel/readerapp/model/Epub;", "pdf", "Lcom/nimeshpatel/readerapp/model/Pdf;", "publicDomain", "quoteSharingAllowed", "textToSpeechPermission", "viewability", "webReaderLink", "(Ljava/lang/String;Ljava/lang/String;ZLcom/nimeshpatel/readerapp/model/Epub;Lcom/nimeshpatel/readerapp/model/Pdf;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessViewStatus", "()Ljava/lang/String;", "getCountry", "getEmbeddable", "()Z", "getEpub", "()Lcom/nimeshpatel/readerapp/model/Epub;", "getPdf", "()Lcom/nimeshpatel/readerapp/model/Pdf;", "getPublicDomain", "getQuoteSharingAllowed", "getTextToSpeechPermission", "getViewability", "getWebReaderLink", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class AccessInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String accessViewStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    private final boolean embeddable = false;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.Epub epub = null;
    @org.jetbrains.annotations.NotNull
    private final com.nimeshpatel.readerapp.model.Pdf pdf = null;
    private final boolean publicDomain = false;
    private final boolean quoteSharingAllowed = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String textToSpeechPermission = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String viewability = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String webReaderLink = null;
    
    public AccessInfo(@org.jetbrains.annotations.NotNull
    java.lang.String accessViewStatus, @org.jetbrains.annotations.NotNull
    java.lang.String country, boolean embeddable, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.Epub epub, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.Pdf pdf, boolean publicDomain, boolean quoteSharingAllowed, @org.jetbrains.annotations.NotNull
    java.lang.String textToSpeechPermission, @org.jetbrains.annotations.NotNull
    java.lang.String viewability, @org.jetbrains.annotations.NotNull
    java.lang.String webReaderLink) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAccessViewStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final boolean getEmbeddable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.Epub getEpub() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.Pdf getPdf() {
        return null;
    }
    
    public final boolean getPublicDomain() {
        return false;
    }
    
    public final boolean getQuoteSharingAllowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTextToSpeechPermission() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getViewability() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebReaderLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
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
    public final com.nimeshpatel.readerapp.model.Epub component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.Pdf component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.AccessInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String accessViewStatus, @org.jetbrains.annotations.NotNull
    java.lang.String country, boolean embeddable, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.Epub epub, @org.jetbrains.annotations.NotNull
    com.nimeshpatel.readerapp.model.Pdf pdf, boolean publicDomain, boolean quoteSharingAllowed, @org.jetbrains.annotations.NotNull
    java.lang.String textToSpeechPermission, @org.jetbrains.annotations.NotNull
    java.lang.String viewability, @org.jetbrains.annotations.NotNull
    java.lang.String webReaderLink) {
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