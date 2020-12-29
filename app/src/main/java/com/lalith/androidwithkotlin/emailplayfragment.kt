package com.lalith.androidwithkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class emailplayfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.email_play,container,false)
        var btn = view.findViewById<Button>(R.id.btn_email)

        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setData(Uri.parse("mailto:"))
            var to="xyz@gmail.com"
            intent.putExtra(Intent.EXTRA_EMAIL, to)
            intent.putExtra(Intent.EXTRA_SUBJECT, "First Email")
            intent.putExtra(Intent.EXTRA_TEXT, "hey, this is my first email message")
            intent.setType("message/rfc822")
            val chooser = Intent.createChooser(intent,"Send Email")
            startActivity(chooser)
        }

        return view
    }
}