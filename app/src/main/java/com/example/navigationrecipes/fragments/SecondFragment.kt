package com.example.navigationrecipes.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationrecipes.R
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewFragment = inflater.inflate(R.layout.fragment_second, container, false)

        viewFragment.imgButton.setOnClickListener {
            Navigation.findNavController(viewFragment)
                .navigate(R.id.action_secondFragment_to_firstFragment)
        }
        return viewFragment
    }
    }
