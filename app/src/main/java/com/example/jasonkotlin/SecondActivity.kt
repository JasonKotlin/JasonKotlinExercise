package com.example.jasonkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        if(intent != null && !TextUtils.isEmpty(intent.getStringExtra("key"))){
            val msg: String = intent.getStringExtra("key")
            val txt1 = findViewById<TextView>(R.id.txt1).apply {
                text = msg
                setTextColor(Color.BLUE)
            }
        }
    }
}