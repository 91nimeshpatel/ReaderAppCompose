package com.nimeshpatel.readerapp.model;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.PropertyName;
import java.sql.Time;
import javax.annotation.PropertyKey;

/**
 * Created by Nimesh Patel on 12-Dec-24.
 * Purpose:
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b6\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020KH\u00d6\u0001J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b\'\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017\u00a8\u0006M"}, d2 = {"Lcom/nimeshpatel/readerapp/model/MBook;", "", "id", "", "title", "authors", "notes", "photoUrl", "categories", "publishedDate", "rating", "", "description", "pageCount", "startedReading", "Lcom/google/firebase/Timestamp;", "finishedReading", "userId", "googleBookId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;Lcom/google/firebase/Timestamp;Ljava/lang/String;Ljava/lang/String;)V", "getAuthors", "()Ljava/lang/String;", "setAuthors", "(Ljava/lang/String;)V", "getCategories", "setCategories", "getDescription", "setDescription", "getFinishedReading", "()Lcom/google/firebase/Timestamp;", "setFinishedReading", "(Lcom/google/firebase/Timestamp;)V", "getGoogleBookId", "setGoogleBookId", "getId", "setId", "getNotes", "setNotes", "getPageCount", "setPageCount", "getPhotoUrl", "setPhotoUrl", "getPublishedDate", "setPublishedDate", "getRating", "()Ljava/lang/Double;", "setRating", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getStartedReading", "setStartedReading", "getTitle", "setTitle", "getUserId", "setUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/Timestamp;Lcom/google/firebase/Timestamp;Ljava/lang/String;Ljava/lang/String;)Lcom/nimeshpatel/readerapp/model/MBook;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MBook {
    @com.google.firebase.firestore.Exclude
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    private java.lang.String authors;
    @org.jetbrains.annotations.Nullable
    private java.lang.String notes;
    @org.jetbrains.annotations.Nullable
    private java.lang.String photoUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String categories;
    @org.jetbrains.annotations.Nullable
    private java.lang.String publishedDate;
    @org.jetbrains.annotations.Nullable
    private java.lang.Double rating;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable
    private java.lang.String pageCount;
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.Timestamp startedReading;
    @org.jetbrains.annotations.Nullable
    private com.google.firebase.Timestamp finishedReading;
    @org.jetbrains.annotations.Nullable
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String googleBookId;
    
    public MBook(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String authors, @org.jetbrains.annotations.Nullable
    java.lang.String notes, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String categories, @org.jetbrains.annotations.Nullable
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable
    java.lang.Double rating, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String pageCount, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp startedReading, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp finishedReading, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String googleBookId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAuthors() {
        return null;
    }
    
    public final void setAuthors(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "book_photo_url")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "book_photo_url")
    public final void setPhotoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "published_date")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "published_date")
    public final void setPublishedDate(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "page_count")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPageCount() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "page_count")
    public final void setPageCount(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "started_reading_at")
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp getStartedReading() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "started_reading_at")
    public final void setStartedReading(@org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "finished_reading_at")
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp getFinishedReading() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "finished_reading_at")
    public final void setFinishedReading(@org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "user_id")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserId() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "user_id")
    public final void setUserId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @com.google.firebase.firestore.PropertyName(value = "google_book_id")
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGoogleBookId() {
        return null;
    }
    
    @com.google.firebase.firestore.PropertyName(value = "google_book_id")
    public final void setGoogleBookId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public MBook() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.firebase.Timestamp component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
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
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nimeshpatel.readerapp.model.MBook copy(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String authors, @org.jetbrains.annotations.Nullable
    java.lang.String notes, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String categories, @org.jetbrains.annotations.Nullable
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable
    java.lang.Double rating, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String pageCount, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp startedReading, @org.jetbrains.annotations.Nullable
    com.google.firebase.Timestamp finishedReading, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String googleBookId) {
        return null;
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
}