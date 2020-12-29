package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment

class imgbtnplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.imgbtnplay,container,false)
        var image_button = view.findViewById<ImageButton>(R.id.imgbtn)

        image_button.setOnClickListener {
            Toast.makeText(activity,"Image Button Clicked !",Toast.LENGTH_SHORT).show()
        }

        return view
    }
}