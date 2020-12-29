package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class positiontoastplayfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.position_toast_play, container, false)
        var button1 = view.findViewById<Button>(R.id.button1)
        var button2 = view.findViewById<Button>(R.id.button2)
        var button3 = view.findViewById<Button>(R.id.button3)
        var button4 = view.findViewById<Button>(R.id.button4)
        var button5 = view.findViewById<Button>(R.id.button5)

        button1.setOnClickListener {
            val toast = Toast.makeText(activity, "CENTER", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }

        button2.setOnClickListener {
            val toast = Toast.makeText(activity, " TOP", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 250)
            toast.show()
        }

        button3.setOnClickListener {
            val toast = Toast.makeText(activity, "BOTTOM", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 250)
            toast.show()
        }

        button4.setOnClickListener {
            val toast = Toast.makeText(activity, "LEFT", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.LEFT, 0, 250)
            toast.show()
        }

        button5.setOnClickListener {
            val toast = Toast.makeText(activity, "RIGHT", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.RIGHT, 0, 250)
            toast.show()
        }

        return view
    }


}