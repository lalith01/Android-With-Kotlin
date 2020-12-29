package com.lalith.androidwithkotlin

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lalith.androidwithkotlin.toast
import kotlinx.android.synthetic.main.custom_toast_msg.*

class customtoastplayfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view1: View = inflater.inflate(R.layout.custom_toast_play, container, false)
        var btn = view1.findViewById<Button>(R.id.btn)
        val layout = layoutInflater.inflate(R.layout.custom_toast_msg,toast)

        btn.setOnClickListener {
            Toast(activity).apply {
                duration = Toast.LENGTH_SHORT
                view = layout
            }.show()
        }
        return view1
    }
}