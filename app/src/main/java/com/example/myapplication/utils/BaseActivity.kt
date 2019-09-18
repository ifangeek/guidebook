package com.example.myapplication.utils

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_attractions.*

@SuppressLint("Registered")
abstract class BaseActivity : AppCompatActivity() {

    abstract fun layout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout())
        setUpToolbar()
    }

    private fun setUpToolbar(homeAsUpEnable: Boolean = true, @DrawableRes inDrawable: Int = R.drawable.ic_back) {
        setSupportActionBar(toolbar as Toolbar)
        supportActionBar?.apply {
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(homeAsUpEnable)
            setHomeAsUpIndicator(
                ContextCompat.getDrawable(
                    this@BaseActivity,
                    inDrawable
                )
            )
        }
    }

}