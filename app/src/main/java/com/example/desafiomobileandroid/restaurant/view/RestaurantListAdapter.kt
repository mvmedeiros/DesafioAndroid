package com.example.desafiomobileandroid.restaurant.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.restaurant.model.RestaurantModel

class RestaurantListAdapter (private val dataset: List<RestaurantModel>,
                             private val listener: (RestaurantModel) -> Unit):
                            RecyclerView.Adapter<RestaurantListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_restaurant, parent, false)
        return RestaurantListViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantListViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataset.size
}