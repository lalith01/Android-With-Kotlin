package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_text_view.*

class tvplayfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.tvplay,container,false)
        var textView : TextView = view.findViewById(R.id.tv_play)

        textView.setOnClickListener {
            Toast.makeText(activity,"Kotlin With Android",Toast.LENGTH_SHORT).show()
        }
        return view
    }
}