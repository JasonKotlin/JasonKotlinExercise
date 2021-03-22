package com.example.jasonkotlin

import android.os.Bundle
import android.view.View
import com.example.jasonkotlin.baseclass.BaseActivity
import com.example.jasonkotlin.view.HomeFragment

/**
 * TODO 1: 每頁 Title 會隨練習題目顯示，從除了首頁，都以 Fragment 處理
 * TODO 2: 點擊列表時，跳出相關練習的 list，用 Recyclerview 處理，把網路的30天全做一次
 *         參考網址: https://ithelp.ithome.com.tw/users/20107329/ironman/1286
 */
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transactionFragment(HomeFragment(),false, isPop = false)
    }

    fun progressbarClick(view: View) {
        //目前不做事，以後可能 load 資料的時候就可以叫來用
    }
}