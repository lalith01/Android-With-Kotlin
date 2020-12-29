package com.lalith.androidwithkotlin

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.simple_toast_kotlin.*
import kotlinx.android.synthetic.main.simple_toast_play.*

class simpletoastplayfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.simple_toast_play, container, false)
        var button1 = view.findViewById<Button>(R.id.button1)
        var button2 = view.findViewById<Button>(R.id.button2)
        button1.setOnClickListener {
            Toast.makeText(activity,"This is a short toast",Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(activity,"This is a long toast",Toast.LENGTH_LONG).show()
        }
        return view
    }
}