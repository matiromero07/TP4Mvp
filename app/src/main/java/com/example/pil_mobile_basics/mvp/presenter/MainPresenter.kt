package com.example.pil_mobile_basics.mvp.presenter

import com.example.pil_mobile_basics.mvp.contract.MainContract

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) : MainContract.Presenter {
    init {
        view.clickButtonIncrease { onButtonPressedIncrease() }
        view.clickButtonDecrease { onButtonPressedDecrease() }
        view.clickButtonReset { onButtonPressedReset() }
    }

    override fun onButtonPressedIncrease() {
        model.inc()
        view.setCount(model.getCount())
    }

    override fun onButtonPressedDecrease() {
        model.dec()
        view.setCount(model.getCount())
    }

    override fun onButtonPressedReset() {
        model.reset()
        view.setCount(model.getCount())
    }

}