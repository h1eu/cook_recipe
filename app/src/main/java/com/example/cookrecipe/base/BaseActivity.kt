package com.example.cookrecipe.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<BINDING: ViewDataBinding> : AppCompatActivity() {
    protected lateinit var binding: BINDING

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this,getContentLayout())
        initView()
        observerLiveData()
    }

    abstract fun observerLiveData()

    abstract fun initView()

    abstract fun getContentLayout(): Int
}