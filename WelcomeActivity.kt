package com.example.worksheet3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class WelcomeActivity : AppCompatActivity() {

    var tablayout:TabLayout?=null
    var viewPage:ViewPager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        tablayout=findViewById(R.id.tab1)
        viewPage=findViewById(R.id.viewpager1)

        val ad=MyAdapter(supportFragmentManager)

        this.viewPage!!.adapter=ad

        this.tablayout!!.setupWithViewPager(this.viewPage)


    }
}
