package com.example.demo_kotlin_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    var selected = MutableLiveData<String>()

    fun setSelected(item: String) {
        selected.value = item
    }
}