package com.ajc.tasty.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajc.tasty.R
import com.ajc.tasty.model.local.FoodEntity

class Adapter(
    private var list: MutableList<FoodEntity>,
    private val onClick: OnClick,
    private var context: Context
) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view1: View = inflater.inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view1, onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val type = list[position] //or val type = list.get(position)
        holder.setData(type)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}