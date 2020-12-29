package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_main_activity2_intent.*

class MainActivity2_intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main_activity2_intent)

        val actionBar = supportActionBar
        actionBar!!.title = "Data Passed Activity"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));

        val bundle:Bundle? = intent.extras
        val str = bundle!!.getString("msg")
        tv.text = str

    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }
}