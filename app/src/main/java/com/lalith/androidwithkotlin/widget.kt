package com.lalith.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_widget.*

class widget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_widget)

        val actionBar = supportActionBar
        actionBar!!.title = "Widgets"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        var datalist:ArrayList<rvData1> = ArrayList()
        datalist.add(rvData1("TextView"))
        datalist.add(rvData1("EditText"))
        datalist.add(rvData1("Button"))
        datalist.add(rvData1("ImageView"))
        datalist.add(rvData1("ImageButton"))
        datalist.add(rvData1("RadioButton"))
        datalist.add(rvData1("CheckBox"))
        //datalist.add(rvData1("RatingBar"))
        datalist.add(rvData1("Spinner"))
        //datalist.add(rvData1("Switch"))
        //datalist.add(rvData1("Progress Dialog"))
        /*datalist.add(rvData1("AutoComplete TextView"))
        datalist.add(rvData1("TextSwitcher"))
        datalist.add(rvData1("CheckedTextView"))
        datalist.add(rvData1("ToogleButton"))
        datalist.add(rvData1("ScrollView"))*/

        widget_rv.layoutManager = LinearLayoutManager(this@widget,LinearLayoutManager.VERTICAL,false)
        widget_rv.adapter = activityrvAdapter(this,datalist)
    }

    //handle onbckpressed
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}