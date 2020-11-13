package com.example.desafiomobileandroid.restaurant.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.restaurant.model.RestaurantModel
import com.example.desafiomobileandroid.restaurant.repository.RestaurantRepository
import com.example.desafiomobileandroid.restaurant.viewModel.RestaurantListViewModel

class RestaurantListFragment : Fragment() {
    lateinit var restaurantListView: View
    lateinit var restaurantListViewModel: RestaurantListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        restaurantListView = inflater.inflate(R.layout.fragment_restaurant_list, container, false)
        restaurantListViewModel = ViewModelProvider(this,
            RestaurantListViewModel.ListRestaurantListViewModelFactory(RestaurantRepository())
        ).get(RestaurantListViewModel::class.java)

        restaurantListViewModel.restaurantList.observe(this, Observer {
            createList(it)
        })

        restaurantListViewModel.getList()
        return restaurantListView
    }

    fun createList(restaurant: List<RestaurantModel>) {
        val recyclerView = restaurantListView.findViewById<RecyclerView>(R.id.rvRestaurantList)
        val manager = LinearLayoutManager(context)

        val customAdapter = RestaurantListAdapter(restaurant) {
            val bundle = bundleOf("NAME" to it.name, "IMAGE" to it.image)
            restaurantListView.findNavController().navigate(R.id.action_restaurantsListFragment_to_restaurantFragment, bundle)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = manager
            adapter = customAdapter
        }
    }

    companion object {
        const val RESTAURANT_NAME = "NAME"
        const val RESTAURANT_IMAGE = "IMAGE"
        const val RESTAURANT_ADDRESS = "ADDRESS"
        const val RESTAURANT_CLOSE_TIME = "CLOSE_TIME"
    }
}