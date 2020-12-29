package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class rtbnplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.rtbnplay, container, false)
        var radio_btn = view.findViewById<Button>(R.id.rbtn)
        var rg = view.findViewById<RadioGroup>(R.id.rg)

        radio_btn.setOnClickListener {
            val check:Int = rg.checkedRadioButtonId
            if(check != -1)
            {
                val st= view.findViewById<RadioButton>(check)
                var str = st.text
                Toast.makeText(activity,"Status : $str",Toast.LENGTH_SHORT).show()
            }

            else
            {
                Toast.makeText(activity,"Nothing Selected",Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}