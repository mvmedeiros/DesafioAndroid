package com.example.desafiomobileandroid.menu.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.menu.model.MenuOptionModel

class MenuViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    private val image = view.findViewById<ImageView>(R.id.ivMenuOptionImage)
    private val name = view.findViewById<TextView>(R.id.tvMenuOptionName)

    fun bind(menuOption: MenuOptionModel){
        name.text = menuOption.name
        image.setImageDrawable(ContextCompat.getDrawable(view.context, menuOption.image))
    }
}