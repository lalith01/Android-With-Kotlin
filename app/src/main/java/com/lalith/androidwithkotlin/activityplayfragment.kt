package com.lalith.androidwithkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class activityplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.activity_play,container,false)
        var button = view.findViewById<Button>(R.id.btn)

        Toast.makeText(activity,"Activity 1", Toast.LENGTH_SHORT).show()

        button.setOnClickListener {
            val intent = Intent(view.context, intentactivity1::class.java)
            view.context.startActivity(intent)
        }
        return view
    }
}