package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_intent.*

class intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_intent)

        val actionBar = supportActionBar
        actionBar!!.title = "Intents"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        var datalist:ArrayList<rvData1> = ArrayList()

        datalist.add(rvData1("Change Activites (Explicit)"))
        datalist.add(rvData1("Pass Data Between Activites (Explicit)"))
        datalist.add(rvData1("Launch Email (Implicit)"))
        datalist.add(rvData1("Launch WhatsApp (Implicit)"))

        intent_rv.layoutManager = LinearLayoutManager(this@intent, LinearLayoutManager.VERTICAL,false)
        intent_rv.adapter = intentrvadapter(this,datalist)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}