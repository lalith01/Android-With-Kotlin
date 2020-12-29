package com.lalith.androidwithkotlin

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_text_view.*
import kotlinx.android.synthetic.main.tvxml.*

class textView : AppCompatActivity()
{

    lateinit var fmng: FragmentManager
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_text_view)

        val actionBar = supportActionBar
        actionBar!!.title = "TextView"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)


        val xml = tvxmlfragment()
        val kotlin = tvkotlinfragment()
        val run = tvplayfragment()

        setCurrentFragment(xml)

        tv_bottom_nav.setOnNavigationItemSelectedListener {
           when(it.itemId)
           {
               R.id.bottom_nav_xml -> {
                   setCurrentFragment(xml)
               }
               R.id.bottom_nav_kotlin -> {
                   setCurrentFragment(kotlin)
               }
               R.id.bottom_nav_run -> {
                   setCurrentFragment(run)
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
        replace(R.id.tv_fragment_layout,fragment)
        commit()
    }
}

/*& with &amp;
> with &gt;
< with &lt;
" with &quot;, &ldquo; or &rdquo;
' with &apos;, &lsquo; or &rsquo;
} with &#125;*/