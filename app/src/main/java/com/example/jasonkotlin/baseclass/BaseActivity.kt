package com.example.jasonkotlin.baseclass

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jasonkotlin.R
import com.example.jasonkotlin.databinding.ActivityMainBinding
import com.example.jasonkotlin.viewmodel.ChangeViewModel

open class BaseActivity : AppCompatActivity() {
    val viewModel by viewModels<ChangeViewModel>()
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.apply {
            lifecycleOwner = this@BaseActivity
            toolbarViewModel = viewModel
            back.setOnClickListener(View.OnClickListener {
                if(supportFragmentManager.backStackEntryCount > 0)
                    supportFragmentManager.popBackStack()
                else{
                    finish()
                }
            })
        }

        setContentView(mBinding.root)
    }

    override fun onCreateView(
            parent: View?,
            name: String,
            context: Context,
            attrs: AttributeSet
    ): View? {
        return super.onCreateView(parent, name, context, attrs)
    }

    fun transactionFragment(fragment: BaseFragment, isAdd: Boolean, isPop: Boolean) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(isPop && supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
            return
        } else if (isAdd) {
            if (!fragment.isAdded) {
                fragmentTransaction.add(R.id.base_main_container, fragment)
                fragmentTransaction.addToBackStack(fragment.javaClass.name)
            } else {
                return
            }
        } else {
            fragmentTransaction.replace(R.id.base_main_container, fragment)
        }

        fragmentTransaction.commitAllowingStateLoss()
    }
}