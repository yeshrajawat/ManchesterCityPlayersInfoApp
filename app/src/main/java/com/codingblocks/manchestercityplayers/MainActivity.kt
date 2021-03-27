package com.codingblocks.manchestercityplayers

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nameslist.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpTabs()

    }

    private fun setUpTabs() {
        val adapter = ViewPager(supportFragmentManager)
        adapter.add(ManchesterCityMens(),"MENS")
        adapter.add(ManchesterCityWOMENS(),"WOMENS")
        adapter.add((ManchesterCityEDS()),"EDS")
        viewpager.adapter = adapter

        tabs.setupWithViewPager(viewpager)


    }
}