package com.example.pil_mobile_basics.mvp.contract

interface MainContract {
    interface Model {
        fun getCount(): String
        fun reset()
        fun inc()
        fun dec()
    }


    interface View {
        fun txtNumber(): String
        fun setCount(count: String)
        fun clickButtonIncrease(function: () -> Unit)
        fun clickButtonDecrease(function: () -> Unit)
        fun clickButtonReset(function: () -> Unit)
    }

    interface Presenter {
        fun onButtonPressedIncrease()
        fun onButtonPressedDecrease()
        fun onButtonPressedReset()
    }

}