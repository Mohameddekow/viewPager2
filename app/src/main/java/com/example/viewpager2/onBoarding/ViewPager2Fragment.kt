package com.example.viewpager2.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2.R
import com.example.viewpager2.databinding.FragmentViewPager2Binding
import com.example.viewpager2.onBoarding.screens.FirstScreen
import com.example.viewpager2.onBoarding.screens.SecondScreen
import com.example.viewpager2.onBoarding.screens.ThirdScreen


class ViewPager2Fragment : Fragment() {
    lateinit var binding: FragmentViewPager2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=  FragmentViewPager2Binding.inflate(layoutInflater, container, false)
        val root = binding.root
        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
            )
        binding.viewPager2.adapter = adapter


        return root
    }
}