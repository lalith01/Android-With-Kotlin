package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class imgplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.imgplay, container, false)
        var button = view.findViewById<ImageView>(R.id.img)
        button.setOnClickListener {
            Toast.makeText(context, "Button Clicked !", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}