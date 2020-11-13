package com.example.desafiomobileandroid.restaurant.repository

import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.restaurant.model.RestaurantModel

class RestaurantRepository {
    var restaurantFinalList = mutableListOf<RestaurantModel>(
        RestaurantModel(
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "22:00",
            R.drawable.tony_roma,
            getMenu()
        ),
        RestaurantModel(
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "00:00",
            R.drawable.tony_roma,
            getMenu()
        ),
        RestaurantModel(
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            "00:00",
            R.drawable.tony_roma,
            getMenu()
        ),
        RestaurantModel(
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            "01:00",
            R.drawable.tony_roma,
            getMenu()
        )
    )

    fun getRestaurantList(): MutableList<RestaurantModel> {
        return restaurantFinalList
    }

    fun getList(callback: (restaurant: List<RestaurantModel>) -> Unit) {
        callback.invoke(getRestaurantList())
    }

    fun getMenu(): List<Int> {
        return listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }
}