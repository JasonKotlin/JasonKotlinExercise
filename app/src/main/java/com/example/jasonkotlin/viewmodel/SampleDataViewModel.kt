package com.example.kotlin_base_demo.viewmmodel

import SingleLiveEvent
import androidx.lifecycle.ViewModel

class SampleDataViewModel : ViewModel() {
    val changeClickEvent = SingleLiveEvent<Boolean>()
    fun changeView() {
        changeClickEvent.value = true
    }
}