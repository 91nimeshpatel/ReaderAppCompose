package com.nimeshpatel.readerapp.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Nimesh Patel on 01-Dec-24.
 * Purpose:
 */
@HiltAndroidApp
class ReaderApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}