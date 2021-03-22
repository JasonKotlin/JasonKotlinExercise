package com.example.jasonkotlin.viewmodel

import SingleLiveEvent
import androidx.lifecycle.ViewModel

class ChangeViewModel : ViewModel() {
    //SingleliveEvent<>() 用來監聽變動時使用
    val changeClickEvent = SingleLiveEvent<Boolean>()
    val popBackStack = SingleLiveEvent<Boolean>()

    fun changeView() {
        changeClickEvent.value = true
    }

    fun popView(){
        popBackStack.value = true
    }
}