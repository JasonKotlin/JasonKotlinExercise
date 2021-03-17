package com.example.jasonkotlin.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.jasonkotlin.R

class ClickExerciseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_click_exercise, container, false)
        view.setBackgroundColor(Color.RED)
        view.findViewById<Button>(R.id.pop).setOnClickListener {
            fragmentManager?.popBackStack()
        }
        return view
    }
}