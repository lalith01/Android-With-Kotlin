package com.lalith.androidwithkotlin

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class lifecycleplayfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view1: View = inflater.inflate(R.layout.lifecycle_play, container, false)
        val toast = Toast.makeText(activity, "onCreate invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
        return view1
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(activity, "onStart invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(activity, "onResume invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(activity, "onPause invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(activity, "onStop invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
    }


    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(activity, "onDestroy invoked", Toast.LENGTH_SHORT)

        val view = toast.view
        view.setBackgroundColor(Color.parseColor("#FF1DA1F2"))

        val toastMessage = toast.view.findViewById<View>(android.R.id.message) as TextView
        toastMessage.setTextColor(Color.WHITE)
        toast.show()
    }

}