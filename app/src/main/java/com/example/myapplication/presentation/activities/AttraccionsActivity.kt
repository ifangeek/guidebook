package com.example.myapplication.presentation.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_attractions.*

class AttraccionsActivity : AppCompatActivity() {

    companion object {
        fun newInstance(context: Context): Intent =
            Intent(
                context,
                AttraccionsActivity::class.java
            )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpToolbar()

    }

    fun setUpToolbar(@DrawableRes inDrawable: Int = R.drawable.ic_back) {
        setSupportActionBar(toolbar as Toolbar?)
        supportActionBar?.apply {
            title = "Atracciones"
            setHomeAsUpIndicator(
                ContextCompat.getDrawable(
                    this@AttraccionsActivity,
                    inDrawable
                )
            )
        }
    }


}