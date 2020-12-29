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
import kotlinx.android.synthetic.main.custom_toast_xml.*

class customtoastxmlfragment : Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.custom_toast_xml, container, false)
        var floatingActionButton =
            view.findViewById<FloatingActionButton>(R.id.custom_toast_xml_floatbtn)
        floatingActionButton.setOnClickListener {
            var clipBoard: ClipboardManager? =
                activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            var text1 = custom_toast_xml.text
            var text2 = custom_toast_message.text
            val text = "MainActivity : \n ${text1} \n\n Custom Toast Message : \n  ${text2}"
            val clipData = ClipData.newPlainText("Copied", text)
            clipBoard!!.setPrimaryClip(clipData)
            Toast.makeText(activity, "Copied", Toast.LENGTH_SHORT).show()
        }
        return view
    }


}