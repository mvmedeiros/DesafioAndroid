package com.example.desafiomobileandroid.menu.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.desafiomobileandroid.menu.model.MenuOptionModel
import com.example.desafiomobileandroid.menu.repository.MenuOptionRepository

class MenuViewModel (
    private val repository: MenuOptionRepository
    ): ViewModel() {
        val menuOption = MutableLiveData<List<MenuOptionModel>>()

        fun getList() {
            repository.getList {
                menuOption.value = it
            }
        }

        class ListMealViewModelFactory(
            private val repository: MenuOptionRepository
        ): ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MenuViewModel(repository) as T
            }
        }
}