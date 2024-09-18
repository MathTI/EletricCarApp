package com.example.eletriccarapp.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.eletriccarapp.ui.CarFragments
import com.example.eletriccarapp.ui.FavoriteFragment

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CarFragments()
            1 -> FavoriteFragment()
            else ->CarFragments()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }

}