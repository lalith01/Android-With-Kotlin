package com.lalith.androidwithkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.view.*

class intentrvadapter (var context: Context, var data: ArrayList<rvData1>): RecyclerView.Adapter<intentrvadapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): intentrvadapter.ViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: intentrvadapter.ViewHolder, position: Int) {
        holder.txtview.setText(data[position].txt)

        holder.relativeLayout.setOnClickListener(View.OnClickListener { view ->
            when (position) {

                0 -> {
                    val intent = Intent(view.context, explicit_intent1::class.java)
                    view.context.startActivity(intent)
                }

                1 ->
                {
                    val intent = Intent(view.context, explicit_intent2::class.java)
                    view.context.startActivity(intent)
                }

                2 ->
                {
                    val intent = Intent(view.context, email_intent::class.java)
                    view.context.startActivity(intent)
                }

                3 ->
                {
                    val intent = Intent(view.context, whatsapp_intent::class.java)
                    view.context.startActivity(intent)
                }

            }
        })


    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtview = view.activity_tv
        var relativeLayout = view.activity_relativeLayout
    }
}