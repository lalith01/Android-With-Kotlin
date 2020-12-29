package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.btnplay.*

class btnplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.btnplay,container,false)
        var button = view.findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            Toast.makeText(context,"Button Clicked !",Toast.LENGTH_SHORT).show()
        }
        return view
    }
}