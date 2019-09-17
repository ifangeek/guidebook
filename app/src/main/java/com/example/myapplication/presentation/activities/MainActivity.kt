package com.example.myapplication.presentation.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        fun newInstance(context: Context): Intent =
            Intent(
                context,
                MainActivity::class.java
            )

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAttractions.setOnClickListener {
            startActivity(AttraccionsActivity.newInstance(this))
        }

    }
}
