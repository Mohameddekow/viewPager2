package com.example.viewpager2

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpager2.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)

        Handler().postDelayed(
            {
            if (onBoardingFinished()){
                 findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                 findNavController().navigate(R.id.action_splashFragment_to_viewPager2Fragment)
                }
            },2000
        )

        //root layout
        val root = binding.root
        return root
    }
    private fun onBoardingFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
         return sharedPref.getBoolean("Finished", false)

    }
}