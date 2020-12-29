package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.Fragment

class cbplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.cbplay,container,false)
        var cb_button = view.findViewById<Button>(R.id.cb_btn)
        var cb1 = view.findViewById<CheckBox>(R.id.cb1)
        var cb2 = view.findViewById<CheckBox>(R.id.cb2)
        var cb3 = view.findViewById<CheckBox>(R.id.cb3)

        cb_button.setOnClickListener {
            if(cb1.isChecked())
            {
                Toast.makeText(activity,cb1.text,Toast.LENGTH_SHORT).show()
            }

            if(cb2.isChecked())
            {
                Toast.makeText(activity,cb2.text,Toast.LENGTH_SHORT).show()
            }

            if(cb3.isChecked())
            {
                Toast.makeText(activity,cb3.text,Toast.LENGTH_SHORT).show()
            }

        }

        return view
    }
}