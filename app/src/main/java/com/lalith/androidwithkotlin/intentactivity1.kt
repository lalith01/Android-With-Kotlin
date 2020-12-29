package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_intentactivity1.*

class intentactivity1 : AppCompatActivity() {

    lateinit var fmng: FragmentManager
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_intentactivity1)

        val actionBar = supportActionBar
        actionBar!!.title = "Activity 2"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        Toast.makeText(this@intentactivity1,"Activity 2",Toast.LENGTH_SHORT).show()

        activity_btn.setOnClickListener {
            /*ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.mainlayout,activityplayfragment()).commit()*/

            onBackPressed()
        }
    }

}