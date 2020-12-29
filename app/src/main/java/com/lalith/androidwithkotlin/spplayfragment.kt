package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class spplayfragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var languages = resources.getStringArray(R.array.Languages)
        var view1: View = inflater.inflate(R.layout.spplay,container,false)
        var spinner = view1.findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = activity?.let { ArrayAdapter(it, android.R.layout.simple_spinner_item, languages) }
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(activity, getString(R.string.selected_item) + " " + "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

        }

        return view1
    }
}
