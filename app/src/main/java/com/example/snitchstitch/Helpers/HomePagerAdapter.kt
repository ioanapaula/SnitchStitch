package com.example.snitchstitch.Helpers

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.snitchstitch.Fragments.CalculatorFragment
import com.example.snitchstitch.Fragments.SavedFragment

class HomePagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 ->  CalculatorFragment()
            1 -> SavedFragment()
            else -> throw RuntimeException("Invalid position $position")
        }
    }
}