package com.example.myapplication.presentation.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.utils.BaseActivity

class DetailAttractions : BaseActivity() {

    companion object {
        fun newInstance(context: Context): Intent =
            Intent(
                context,
                DetailAttractions::class.java
            )
    }

    override fun layout(): Int = R.layout.activity_detail_attraction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}