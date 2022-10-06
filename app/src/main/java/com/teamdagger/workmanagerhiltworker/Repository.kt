package com.teamdagger.workmanagerhiltworker

import android.util.Log
import com.teamdagger.workmanagerhiltworker.RemoteDataSource
import kotlinx.coroutines.delay

class Repository
constructor(
  private val remoteDataSource: RemoteDataSource
) {

    suspend fun sendData(message: String): String {
        val result = remoteDataSource.sendData(message)
        Log.w("FKR", "Processing data for Local Data Source")
        Log.w("FKR", "Data info -> $result")
        delay(3000)
        Log.w("FKR", "Data processing success")
        return result
    }

}