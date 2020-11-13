package com.example.desafiomobileandroid.restaurant.model

import android.graphics.drawable.Drawable

data class RestaurantModel (val name: String, val address: String, val closingTime: String
                            val image: Drawable, val menu: List<Drawable>){
}