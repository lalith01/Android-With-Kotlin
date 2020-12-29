package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_toast.*
import kotlinx.android.synthetic.main.activity_widget.*

class toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_toast)

        val actionBar = supportActionBar
        actionBar!!.title = "Toast"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        var datalist3:ArrayList<rvData1> = ArrayList()
        datalist3.add(rvData1("Simple Toast"))
        datalist3.add(rvData1("Custom Toast"))
        datalist3.add(rvData1("Positioning Toast"))
        //datalist3.add(rvData1("Colored Toast"))

        toast_rv.layoutManager = LinearLayoutManager(this@toast, LinearLayoutManager.VERTICAL,false)
        toast_rv.adapter = activityrvAdapter3(this,datalist3)
    }

    //handle onbckpressed
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}