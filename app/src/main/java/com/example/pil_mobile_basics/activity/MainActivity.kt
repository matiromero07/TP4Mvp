package com.example.pil_mobile_basics.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_mobile_basics.mvp.model.MainModel
import com.example.pil_mobile_basics.mvp.presenter.MainPresenter
import com.example.pil_mobile_basics.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainModel(),MainView(this))
    }
}
