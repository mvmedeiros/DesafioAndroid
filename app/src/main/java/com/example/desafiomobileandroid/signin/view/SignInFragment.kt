package com.example.desafiomobileandroid.signin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.desafiomobileandroid.R

class SignInFragment : Fragment() {
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        onRegister(view, navController)
        onLogin(view, navController)
    }

    private fun onRegister(view: View, navController: NavController) {
        view.findViewById<Button>(R.id.btnSignInRegister).setOnClickListener {
            navController.navigate(R.id.action_signInFragment_to_registerFragment)
        }
    }

    private fun onLogin(view: View, navController: NavController) {
        view.findViewById<Button>(R.id.btnSignInLogin).setOnClickListener {
            navController.navigate(R.id.action_signInFragment_to_restaurantListFragment)
        }
    }
}