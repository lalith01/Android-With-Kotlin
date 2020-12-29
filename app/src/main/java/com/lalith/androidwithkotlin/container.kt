package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_container.*
import kotlinx.android.synthetic.main.activity_widget.*

class container : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_container)

        val actionBar = supportActionBar
        actionBar!!.title = "Container"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        var datalist:ArrayList<rvData1> = ArrayList()
        datalist.add(rvData1("ListView"))
        //datalist.add(rvData1("GridView"))
        datalist.add(rvData1("WebView"))

        container_rv.layoutManager = LinearLayoutManager(this@container, LinearLayoutManager.VERTICAL,false)
        container_rv.adapter = containerrvAdapter(this,datalist)
    }
    //handle onbckpressed
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}