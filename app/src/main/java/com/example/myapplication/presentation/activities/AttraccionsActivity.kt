package com.example.myapplication.presentation.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.presentation.adapters.AttractionsAdapter
import com.example.myapplication.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_attractions.*

class AttraccionsActivity : BaseActivity(),AttractionsAdapter.OnClickAttractionListener {

    override fun layout(): Int = R.layout.activity_attractions

    private lateinit var attractionsAdapter: AttractionsAdapter

    companion object {
        fun newInstance(context: Context): Intent =
            Intent(
                context,
                AttraccionsActivity::class.java
            )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attractionsAdapter = AttractionsAdapter(this)
        rvAttractions.apply {
            adapter = attractionsAdapter
            val linearLayoutManager = GridLayoutManager(context,2)
            linearLayoutManager.spanSizeLookup
            layoutManager = linearLayoutManager
            attractionsAdapter.list = generateSequence(1) { it + 1 }.take(10).toMutableList()
        }



    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onClickAttraction() {
        startActivity(DetailAttractions.newInstance(this))
    }
}