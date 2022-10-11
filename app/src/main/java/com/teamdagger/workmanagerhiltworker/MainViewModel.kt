package com.teamdagger.workmanagerhiltworker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(
    private val repository: Repository
) : ViewModel() {

    private val dataMutableLiveData: MutableLiveData<String> = MutableLiveData()
    val dataLiveData: LiveData<String> = dataMutableLiveData

//    fun getData() {
//        viewModelScope.launch {
//            val data = withContext(Dispatchers.IO) {
//                repository.getData().blockingGet()
//            }
//        }
//    }

}