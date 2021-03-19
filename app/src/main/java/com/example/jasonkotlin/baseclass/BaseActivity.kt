package com.example.jasonkotlin.baseclass

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.jasonkotlin.R

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateView(
            parent: View?,
            name: String,
            context: Context,
            attrs: AttributeSet
    ): View? {
        return super.onCreateView(parent, name, context, attrs)
    }

    fun transactionFragment(fragment: BaseFragment, isAdd: Boolean) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (isAdd) {
            if (!fragment.isAdded) {
                fragmentTransaction.add(R.id.base_main_container, fragment)
                fragmentTransaction.addToBackStack(fragment.javaClass.name)
            } else {
                return
            }
        } else {
            fragmentTransaction.replace(R.id.base_main_container, fragment)
        }
        fragmentTransaction.addToBackStack(fragment.javaClass.name)
        fragmentTransaction.commitAllowingStateLoss()
    }
}