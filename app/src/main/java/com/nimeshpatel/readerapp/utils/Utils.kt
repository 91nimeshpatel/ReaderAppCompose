package com.nimeshpatel.readerapp.utils


import com.google.firebase.Timestamp
import java.text.DateFormat
import java.util.Date

/**
 * Created by Nimesh Patel on 17-Mar-25.
 * Purpose:
 */
fun formatDate(timestamp: Timestamp = Timestamp(Date())): String {
    return DateFormat.getDateInstance().format(timestamp.toDate()).split(",")[0] // March 12
}