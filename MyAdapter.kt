package com.example.worksheet3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(framan:FragmentManager) : FragmentPagerAdapter(framan)
{
    override fun getItem(position: Int): Fragment {
        when(position)
        {
            0-> return HomeFragment()
            1-> return ChatFragment()
            2-> return StatusFragment()
            else -> return HomeFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
         var title:String?=null
        if (position==0) {
            title = "Home"
        }
        else if(position==1) {
            title = "Chat"
        }
        else if(position==2) {
            title = "Status"
        }
        return title
    }


}
