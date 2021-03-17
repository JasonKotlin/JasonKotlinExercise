package com.example.jasonkotlin.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.jasonkotlin.R

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.setBackgroundColor(Color.GREEN)
        view.findViewById<Button>(R.id.change).apply {
            setOnClickListener {
                //todo 1.這裡不能用 fragmentManager 對不對？
                childFragmentManager.beginTransaction().add(R.id.fragment_content, ClickExerciseFragment()).commitAllowingStateLoss()
                childFragmentManager.beginTransaction().addToBackStack(HomeFragment::class.java.simpleName)
                childFragmentManager.beginTransaction().commitAllowingStateLoss()
            }
        }
        return view
    }
}