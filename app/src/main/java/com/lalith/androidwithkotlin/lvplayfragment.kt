package com.lalith.androidwithkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class lvplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.lvplay,container,false)
        var lv = view.findViewById<ListView>(R.id.lv)

        var arr:Array<String> = resources.getStringArray(R.array.list)
        var arrayAdapter = ArrayAdapter<String>(activity!!,android.R.layout.simple_expandable_list_item_1,arr)
        lv.setAdapter(arrayAdapter)

        lv.setOnItemClickListener { parent, view, position, id ->
            var str:String = parent.getItemAtPosition(position) as String
            Toast.makeText(activity,"Your in ${str}", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}