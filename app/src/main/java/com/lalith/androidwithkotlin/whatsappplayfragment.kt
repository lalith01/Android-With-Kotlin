package com.lalith.androidwithkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class whatsappplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.whatsapp_play,container,false)
        var btn = view.findViewById<Button>(R.id.btn_whatsapp)

        btn.setOnClickListener {
            val intent = activity?.packageManager?.getLaunchIntentForPackage("com.whatsapp")
            val chooser = Intent.createChooser(intent,"Launch Whatsapp")
            startActivity(chooser)
        }
        return view
    }
}