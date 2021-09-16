package com.example.viewpager2.onBoarding.screens

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.R
import com.example.viewpager2.databinding.FragmentFirstScreenBinding

class FirstScreen : Fragment() {
    lateinit var binding: FragmentFirstScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstScreenBinding.inflate(layoutInflater, container, false)
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        binding.apply {
            screen1Next.setOnClickListener {
                viewPager2?.currentItem = 1
            }

        }




        val root = binding.root
        return root
    }


}