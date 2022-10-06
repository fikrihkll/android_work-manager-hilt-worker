package com.teamdagger.workmanagerhiltworker.worker

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.teamdagger.workmanagerhiltworker.Repository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.delay

@HiltWorker
class SecretDataWorker
@AssistedInject
constructor(
    @Assisted context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val repository: Repository
) : CoroutineWorker(context, workerParameters){

    override suspend fun doWork(): Result {
        val data = repository.sendData("May Allah always helps and loves me")
        delay(3000)
        Log.w("FKR", "Worker done with return value\n$data")
        return Result.success()
    }
}