package com.example.jasonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.jasonkotlin.fragments.HomeFragment

/**
 * TODO 1: 每頁 Title 會隨練習題目顯示，從除了首頁，都以 Fragment 處理
 * TODO 2: 點擊列表時，跳出相關練習的 list，用 Recyclerview 處理，把網路的30天全做一次
 *         參考網址: https://ithelp.ithome.com.tw/users/20107329/ironman/1286
 */
class MainActivity : AppCompatActivity() {
    private val fragment = supportFragmentManager
    private val transaction = fragment.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupFragment()
    }

    private fun setupFragment(){
        //TODO commitAllowingStateLoss
        transaction.replace(R.id.fragment_content, HomeFragment()).commitAllowingStateLoss()
    }

    fun progressbarClick(view: View) {
        //目前不做事，以後可能 load 資料的時候就可以叫來用
    }

    fun changeFragment(){
        //切換 Fragment 時呼叫
    }
}