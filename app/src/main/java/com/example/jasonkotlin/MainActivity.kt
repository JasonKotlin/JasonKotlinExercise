package com.example.jasonkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test1(view: View) {
        val i : Intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("key", "goSecond")
        }

        startActivity(i)
    }
}