package com.example.viewpager2.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.R
import com.example.viewpager2.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {
    lateinit var binding: FragmentSecondScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondScreenBinding.inflate(layoutInflater, container, false)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        binding.apply {
            screen2Next.setOnClickListener {
                viewPager2?.currentItem = 2
            }

        }

        val root = binding.root
        return root
    }

}