package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditText : AppCompatActivity() {

    lateinit var fmng: FragmentManager
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_edit_text)

        val actionBar = supportActionBar
        actionBar!!.title = "EditText"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        val et_xml = etxmlfragment()
        val et_kotlin = etkotlinfragment()
        val et_play = etplay()

        setCurrentFragment(et_xml)


        et_bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.bottom_nav_xml ->
                {
                    setCurrentFragment(et_xml)
                }

                R.id.bottom_nav_kotlin ->
                {
                    setCurrentFragment(et_kotlin)
                }

                R.id.bottom_nav_run ->
                {
                    setCurrentFragment(et_play)
                }
            }

            true
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.et_fragment_layout,fragment)
        commit()
    }
}