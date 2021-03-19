package com.example.jasonkotlin.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import com.example.jasonkotlin.R
import com.example.jasonkotlin.baseclass.BaseFragment
import com.example.jasonkotlin.databinding.FragmentClickExerciseBinding
import com.example.kotlin_base_demo.viewmmodel.SampleDataViewModel

class ClickExerciseFragment : BaseFragment() {
    val mViewModel by viewModels<SampleDataViewModel>()
    lateinit var mBinding: FragmentClickExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mBinding = FragmentClickExerciseBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
        }
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}