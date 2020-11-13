package com.example.desafiomobileandroid.restaurant.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.desafiomobileandroid.restaurant.model.RestaurantModel
import com.example.desafiomobileandroid.restaurant.repository.RestaurantRepository

class RestaurantListViewModel(private val repository: RestaurantRepository):ViewModel() {
    val restaurantList = MutableLiveData<List<RestaurantModel>>()

    fun getList() {
        repository.getList {
            restaurantList.value = it
        }
    }

    class ListRestaurantListViewModelFactory(
        private val repository: RestaurantRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return RestaurantListViewModel(repository) as T
        }
    }
}