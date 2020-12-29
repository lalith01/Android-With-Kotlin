package com.lalith.androidwithkotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_privacy.*

class privacy : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_privacy)


        val actionBar = supportActionBar
        actionBar!!.title = "Privacy Policy"
        getSupportActionBar()?.setTitle(Html.fromHtml("<font color=\"#14171A\">" + actionBar!!.title + "</font>"));
        actionBar.setDisplayHomeAsUpEnabled(true)

        webViewsetup()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewsetup() // makes sures the webpage opens in the app.
    {
        wv.webViewClient = WebViewClient()
        wv.apply {
            loadUrl("https://androidwithkotlinprivacypolicy.blogspot.com/p/privacy-policy-android-with-kotlin.html")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        onBackPressed()
        return true
    }
}