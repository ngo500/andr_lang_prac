package com.example.android_language_practice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _info : MutableLiveData<Int> = MutableLiveData(0)
    val info: LiveData<Int> = _info

    fun loadData() {
        _info.value = _info.value!! + 1
    }
 }