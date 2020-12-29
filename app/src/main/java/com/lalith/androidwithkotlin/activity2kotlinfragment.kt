package com.lalith.androidwithkotlin

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity2_kotlin.*

class activity2kotlinfragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            var view: View = inflater.inflate(R.layout.activity2_kotlin, container, false)
            var floatingActionButton =
                view.findViewById<FloatingActionButton>(R.id.kotlin_floatactivity)
            floatingActionButton.setOnClickListener {
                var clipBoard: ClipboardManager? =
                    activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val text1 = tv22.text
                val text2 = tv44.text
                val text = "MainActivity : \n ${text1} \n\n Main2Activity : \n  ${text2}"
                val clipData = ClipData.newPlainText("Copied", text)
                clipBoard!!.setPrimaryClip(clipData)
                Toast.makeText(activity, "Copied", Toast.LENGTH_SHORT).show()
            }
            return view
        }
    }