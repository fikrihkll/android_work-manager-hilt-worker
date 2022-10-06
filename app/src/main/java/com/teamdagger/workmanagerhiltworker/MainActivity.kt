package com.teamdagger.workmanagerhiltworker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.work.*
import com.teamdagger.workmanagerhiltworker.databinding.ActivityMainBinding
import com.teamdagger.workmanagerhiltworker.worker.SecretDataWorker

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            startWorkManager()
        }
    }

    private fun startWorkManager() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        val imageWorker = OneTimeWorkRequestBuilder<SecretDataWorker>()
            .setConstraints(constraints)
            .addTag("SECRET")
            .build()

        WorkManager.getInstance(this.applicationContext).enqueueUniqueWork(
            "SecretDataWorker",
            ExistingWorkPolicy.KEEP,
            imageWorker
        )
    }
}