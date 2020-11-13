package com.example.desafiomobileandroid.restaurant.view

import android.view.View
import android.widget.TextView
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.restaurant.model.RestaurantModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_restaurant.view.*

class RestaurantListViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    private val name = view.findViewById<TextView>(R.id.tvRestaurantName)
    private val address = view.findViewById<TextView>(R.id.tvRestaurantAdress)
    private val closingTime = view.findViewById<TextView>(R.id.tvRestaurantClosingTime)
    private val image = view.findViewById<ImageView>(R.id.ivRestaurant)

    fun bind(restaurant: RestaurantModel){
        name.text = restaurant.name
        address.text = restaurant.address
        closingTime.text = "Fecha às {restaurant.closingTime}."
        //Picasso.get().load(restaurant.image).into(image)
        image.setImageDrawable(ContextCompat.getDrawable(view.context, restaurant.image))
    }
}