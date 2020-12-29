package com.lalith.androidwithkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.view.*
import kotlinx.android.synthetic.main.home_layout.view.*
import kotlinx.android.synthetic.main.nav_header.view.*


class rvAdapter(var context: Context, var data: ArrayList<rvData>): RecyclerView.Adapter<rvAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvAdapter.ViewHolder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.home_layout, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: rvAdapter.ViewHolder, position: Int) {
        holder.imgview.setImageResource(data[position].img)
        holder.txtview.setText(data[position].txt)


        holder.cardView.setOnClickListener(View.OnClickListener { view ->
            when (position) {
                0 -> {
                    val intent = Intent(view.context, widget::class.java)
                    view.context.startActivity(intent)
                }

                1 -> {
                    val intent = Intent(view.context, lifecycle::class.java)
                    view.context.startActivity(intent)
                }

                2 ->
                {
                    val intent = Intent(view.context, toast::class.java)
                    view.context.startActivity(intent)
                }

                3 ->
                {
                    val intent = Intent(view.context, intent::class.java)
                    view.context.startActivity(intent)
                }

                4 ->
                {
                    val intent = Intent(view.context, alert_dialog::class.java)
                    view.context.startActivity(intent)
                }

                5 ->
                {
                    val intent = Intent(view.context, simple_notification::class.java)
                    view.context.startActivity(intent)
                }

                6 ->
                {
                    val intent = Intent(view.context, datetime::class.java)
                    view.context.startActivity(intent)
                }

                7 ->
                {
                    val intent = Intent(view.context, container::class.java)
                    view.context.startActivity(intent)
                }

            }
        })

    }
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var txtview = view.home_tv
        var imgview = view.home_img
        var cardView = view.cardview
    }
}