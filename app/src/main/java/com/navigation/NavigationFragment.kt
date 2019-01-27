package com.navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_navigation.*

class NavigationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        // Sending data from one fragment to another fragment
        goToDetailFragment.setOnClickListener {

            val value = websiteurl.text.toString()
            val bundle = Bundle()
            bundle.putString("value", value)
            navController.navigate(R.id.next_screen, bundle)
        }
    }
}
