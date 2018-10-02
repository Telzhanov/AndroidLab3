package com.example.askhat.androidlab3

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.view.View
import com.example.askhat.androidlab3.R.string.category
import com.example.askhat.androidlab3.R.string.recent_news

class CategoryPageAdapter(fr:FragmentManager):FragmentPagerAdapter(fr){
    override fun getItem(position: Int): Fragment {
        when(position){
            0->{
                return NewsFragment()
            }
            else-> return CategoryFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Recent news"
            1->return "Categories"
            else->return null
        }
    }

}