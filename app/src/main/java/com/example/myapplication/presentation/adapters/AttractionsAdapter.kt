package com.example.myapplication.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class AttractionsAdapter(private val listener: OnClickAttractionListener): RecyclerView.Adapter<AttractionsAdapter.ViewHolder>() {

    var list = mutableListOf<Int>()

    interface OnClickAttractionListener{
        fun onClickAttraction()
    }

    private val onClickListener = View.OnClickListener {
        listener.onClickAttraction()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_attractions, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener(onClickListener)

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    }
}