package com.example.testapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    private val myFragmentList: MutableList<Fragment> = ArrayList()
    private val myFragmentTitleList: MutableList<String> = ArrayList()

    override fun getItemCount(): Int {
        return myFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return myFragmentList[position]
    }

    fun getTabTitle(position: Int): String {
        return myFragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        myFragmentList.add(fragment)
        myFragmentTitleList.add(title)


    }
}