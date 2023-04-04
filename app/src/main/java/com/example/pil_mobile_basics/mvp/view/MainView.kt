package com.example.pil_mobile_basics.mvp.view

import android.app.Activity
import com.example.pil_mobile_basics.databinding.ActivityMainBinding
import com.example.pil_mobile_basics.mvp.contract.MainContract
import com.example.pil_mobile_basics.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun txtNumber(): String {
        TODO("Not yet implemented")
    }

    override fun setCount(count: String) {

    }

    override fun clickButtonIncrease(function: () -> Unit) {
        TODO("Not yet implemented")
    }

    override fun clickButtonDecrease(function: () -> Unit) {
        TODO("Not yet implemented")
    }

    override fun clickButtonReset(function: () -> Unit) {
        TODO("Not yet implemented")
    }


}