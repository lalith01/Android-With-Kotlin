package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_datetime.*

class datetime : AppCompatActivity() {

    lateinit var fmng: FragmentManager
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_datetime)

        val actionBar = supportActionBar
        actionBar!!.title = "Date & Time"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        val xml = dntxmlfragment()
        val kotlin = dntkotlinfragment()
        val play = dntplayfragment()

        setCurrentFragment(xml)
        dnt_bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.bottom_nav_xml ->
                {
                    setCurrentFragment(xml)
                }

                R.id.bottom_nav_kotlin ->
                {
                    setCurrentFragment(kotlin)
                }

                R.id.bottom_nav_run ->
                {
                    setCurrentFragment(play)
                }
            }
            true
        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }

    private fun setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.dnt_fragment_layout,fragment)
        commit()
    }
}