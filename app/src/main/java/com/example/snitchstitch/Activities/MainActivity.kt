package com.example.snitchstitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.snitchstitch.Fragments.CalculatorFragment
import com.example.snitchstitch.Fragments.SavedFragment
import com.example.snitchstitch.Helpers.HomePagerAdapter
import com.example.snitchstitch.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayoutMediator = TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Calculator"
                1 -> tab.text = "Saved"
            }
        }
        binding.viewPager.adapter = HomePagerAdapter(this)
        tabLayoutMediator.attach()
    }
}