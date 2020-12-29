package com.lalith.androidwithkotlin


import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class alertplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.alert_play,container,false)
        var button = view.findViewById<Button>(R.id.btn_alert)

        button.setOnClickListener {
            val builder = activity?.let { it1 -> AlertDialog.Builder(it1) }
            builder?.setTitle("Android with kotlin says")
            builder?.setMessage("This is a alert dialog")

            builder?.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(activity,"You Pressed Yes",Toast.LENGTH_SHORT).show()
            })

            builder?.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(activity,"You Pressed No",Toast.LENGTH_SHORT).show()
            })
            builder?.show()
        }

        return view
    }
}