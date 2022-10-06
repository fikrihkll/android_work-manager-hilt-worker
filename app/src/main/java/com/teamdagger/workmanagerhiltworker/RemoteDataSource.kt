package com.teamdagger.workmanagerhiltworker

import android.util.Log
import kotlinx.coroutines.delay

class RemoteDataSource {

    suspend fun sendData(message: String) :String {
        Log.w("FKR", "Sending data...")
        Log.w("FKR", "Data Info: { \"message\": \"$message\" }")
        delay(4000)
        Log.w("FKR", "Data sent successfully")
        return "Data sent successfully"
    }

}