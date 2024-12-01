# Google Play Services
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**

# Firebase
-keep class com.google.firebase.** { *; }
-dontwarn com.google.firebase.**

# Retrofit and Gson
-keep class retrofit2.** { *; }
-dontwarn retrofit2.**
-keep class com.google.gson.** { *; }
-dontwarn com.google.gson.**

# Dagger Hilt
-keep class dagger.hilt.** { *; }
-dontwarn dagger.hilt.**

# Keep all Firebase Messaging classes
-keep class com.google.firebase.messaging.** { *; }
-dontwarn com.google.firebase.messaging.**

# Keep the classes that you need for reflection (change to your package names/classes)
-keep class com.yourpackage.** { *; }

# Keep any classes used for reflection
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

