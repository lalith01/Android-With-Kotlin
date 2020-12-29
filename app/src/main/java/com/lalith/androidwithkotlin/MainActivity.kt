package com.lalith.androidwithkotlin

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.SystemClock.sleep
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_NoActionBar)
        setContentView(R.layout.activity_main)
        sleep(1000);


        var datalist:ArrayList<rvData> = ArrayList()
        datalist.add(rvData(R.drawable.widgets,"Widgets"))
        datalist.add(rvData(R.drawable.lifecycle,"LifeCycle Activity"))
        datalist.add(rvData(R.drawable.toast,"Toast"))
        datalist.add(rvData(R.drawable.intent,"Intents"))
        datalist.add(rvData(R.drawable.alert,"Alert Dialog"))
        datalist.add(rvData(R.drawable.notification,"Notification"))
        datalist.add(rvData(R.drawable.date_time,"Date & Time"))
        datalist.add(rvData(R.drawable.container,"Container"))
        /*datalist.add(rvData(R.drawable.home_menu,"Menu"))
        datalist.add(rvData(R.drawable.fragments,"Fragments"))
        datalist.add(rvData(R.drawable.material,"Material Design"))
        datalist.add(rvData(R.drawable.storage,"Storage"))
        datalist.add(rvData(R.drawable.db,"DataBase"))
        datalist.add(rvData(R.drawable.animation,"Animations"))
        datalist.add(rvData(R.drawable.bluetooth,"Bluetooth"))
        datalist.add(rvData(R.drawable.text_to_speech,"Text to Speech"))
        datalist.add(rvData(R.drawable.maps,"Maps"))*/

        rv.layoutManager = GridLayoutManager(this@MainActivity,2)
        // recyclerview.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        rv.adapter = rvAdapter(this,datalist)


        setSupportActionBar(toolbar)

        val toogle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )

        navigationView = findViewById(R.id.nav_view)

        drawerLayout.addDrawerListener(toogle)
        toogle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.blue));
        toogle.setHomeAsUpIndicator(R.drawable.ic_menu); //set your own
        toogle.syncState()
        navigationView.setNavigationItemSelectedListener(this)

        for (i in 0 until toolbar.getChildCount()) {
            if (toolbar.getChildAt(i) is ImageButton) {
                toolbar.getChildAt(i).setScaleX(1.3f)
                toolbar.getChildAt(i).setScaleY(1.5f)
            }
        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.nav_rate -> {
                try {
                    var uri = Uri.parse("market://details?id="+ packageName)
                    val intent = Intent(Intent.ACTION_VIEW,uri)
                    startActivity(intent)
                }catch (e: ActivityNotFoundException){
                    var uri = Uri.parse("http://play.google.com/apps/details?id="+ packageName)
                    var intent = Intent(Intent.ACTION_VIEW,uri)
                    startActivity(intent)
                }

            }

            R.id.nav_feedback -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.setData(Uri.parse("mailto:"))
                var to = arrayOf("lalith.bondada@gmail.com")
                intent.putExtra(Intent.EXTRA_EMAIL, to)
                intent.putExtra(Intent.EXTRA_SUBJECT, "FeedBack")
                intent.putExtra(Intent.EXTRA_TEXT, "hey, this is my first email message")
                intent.setType("message/rfc822")
                val chooser = Intent.createChooser(intent,"Send Email")
                startActivity(chooser)
            }

            R.id.nav_send -> {
                try {
                    var intent = Intent(Intent.ACTION_SEND)
                    intent.setType("text/plain")
                    var str = "Hi! Download the best Android With Kotlin Tutorial App :\n" +"https://play.google.com/store/apps/details?id=com.lalith.androidwithkotlin&hl=en"
                    var share = "Android With Kotlin"
                    intent.putExtra(Intent.EXTRA_SUBJECT,share)
                    intent.putExtra(Intent.EXTRA_TEXT,str)
                    startActivity(Intent.createChooser(intent,"share by"))
                }catch (e : Exception)
                {
                    Toast.makeText(this@MainActivity,"Error Occurred",Toast.LENGTH_SHORT).show()
                }
            }

            R.id.nav_developer -> {
                val intent = Intent(this@MainActivity,about::class.java)
                startActivity(intent)
            }

            R.id.nav_privacy -> {
                val intent = Intent(this@MainActivity,privacy::class.java)
                startActivity(intent)
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}