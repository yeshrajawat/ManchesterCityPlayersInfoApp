package com.codingblocks.manchestercityplayers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2

class ViewPager(supportFragmentManager:FragmentManager):FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val fragmentlist = ArrayList<Fragment>()
    val titles = ArrayList<String>()
    override fun getCount(): Int {
        return fragmentlist.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentlist[position]
    }
    fun add(fragment:Fragment,title:String)
    {
        fragmentlist.add(fragment)
        titles.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

}