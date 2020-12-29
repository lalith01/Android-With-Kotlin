package com.lalith.androidwithkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_about.*

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "Developer"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        about_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setData(Uri.parse("mailto:"))
            var to = arrayOf("lalith.bondada@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL, to)
            intent.putExtra(Intent.EXTRA_SUBJECT, "First Email")
            intent.putExtra(Intent.EXTRA_TEXT, "hey, this is my first email message")
            intent.setType("message/rfc822")
            val chooser = Intent.createChooser(intent,"Send Email")
            startActivity(chooser)
        }

    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }

}