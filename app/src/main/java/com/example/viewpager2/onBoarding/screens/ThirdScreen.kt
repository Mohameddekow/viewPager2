package com.example.viewpager2.onBoarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.R
import com.example.viewpager2.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
    lateinit var binding: FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(layoutInflater, container, false)
        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        binding.apply {
            screen3GetStarted.setOnClickListener {
                findNavController().navigate(R.id.action_viewPager2Fragment_to_homeFragment)
                onBoardingFinished()
            }

        }


        val root = binding.root
        return root
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}