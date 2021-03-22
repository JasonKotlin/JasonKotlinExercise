package com.example.jasonkotlin.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.jasonkotlin.baseclass.BaseFragment
import com.example.jasonkotlin.databinding.FragmentHomeBinding
import com.example.jasonkotlin.viewmodel.ChangeViewModel

class HomeFragment : BaseFragment() {
    private val mViewModel by viewModels<ChangeViewModel>()
    lateinit var mBinding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mBinding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = mViewModel
        }
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObserver()
    }

    private fun setObserver() {
        mViewModel.changeClickEvent.observe(viewLifecycleOwner, Observer {
            if (it) {
                getBaseActivity().transactionFragment(ClickExerciseFragment(), true, isPop = false)
            }
        })
    }
}