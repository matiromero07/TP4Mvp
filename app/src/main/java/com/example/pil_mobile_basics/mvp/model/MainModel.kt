package com.example.pil_mobile_basics.mvp.model

import com.example.pil_mobile_basics.mvp.contract.MainContract
import java.math.BigDecimal.ONE
import java.math.BigDecimal.ZERO

class MainModel : MainContract.Model{
    private var count = ZERO

    override fun getCount(): String = count.toString()

    override fun reset() {
        count = ZERO
    }

    override fun inc() {
        count += ONE
    }

    override fun dec(){
        count -= ONE
    }
}