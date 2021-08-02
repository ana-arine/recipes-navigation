package com.example.navigationrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationrecipes.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewFragment = inflater.inflate(R.layout.fragment_first, container, false)

        viewFragment.imgPrato1.setOnClickListener {
            Navigation.findNavController(viewFragment)
                .navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return viewFragment
    }
}