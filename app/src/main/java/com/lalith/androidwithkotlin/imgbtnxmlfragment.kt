package com.lalith.androidwithkotlin

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.btnxml.*
import kotlinx.android.synthetic.main.btnxml.btn_xml_tv
import kotlinx.android.synthetic.main.imgbtnxml.*
class imgbtnxmlfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.imgbtnxml,container,false)
        var floatingActionButton = view.findViewById<FloatingActionButton>(R.id.imgbtn_xml_floatbtn)
        floatingActionButton.setOnClickListener {
            var clipBoard : ClipboardManager? = activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val text = imgbtn_xml_tv.text
            val clipData = ClipData.newPlainText("Copied",text)
            clipBoard!!.setPrimaryClip(clipData)
            Toast.makeText(activity,"Copied", Toast.LENGTH_SHORT).show()
        }
        return view
}
}