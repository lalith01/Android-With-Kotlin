package com.lalith.androidwithkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity2_play.*

class activity2playfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.activity2_play,container,false)
        var button = view.findViewById<Button>(R.id.data_btn)

        button.setOnClickListener {
            var str:String = et.text.toString()
            val intent = Intent(view.context, MainActivity2_intent::class.java)
            intent.putExtra("msg",str);
            view.context.startActivity(intent)
        }

        return view
    }
}