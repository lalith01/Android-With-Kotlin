package com.lalith.androidwithkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.view.*

class activityrvAdapter3 (var context: Context, var data: ArrayList<rvData1>): RecyclerView.Adapter<activityrvAdapter3.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): activityrvAdapter3.ViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: activityrvAdapter3.ViewHolder, position: Int) {
        holder.txtview.setText(data[position].txt)

        holder.relativeLayout.setOnClickListener(View.OnClickListener { view ->
            when (position) {

                0 -> {
                    val intent = Intent(view.context, simple_toast::class.java)
                    view.context.startActivity(intent)
                }

                1 ->
                {
                    val intent = Intent(view.context, custom_toast::class.java)
                    view.context.startActivity(intent)
                }

                2 ->
                {
                    val intent = Intent(view.context, positioning_toast::class.java)
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