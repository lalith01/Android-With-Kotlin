package com.lalith.androidwithkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.view.*
import kotlinx.android.synthetic.main.home_layout.view.*

class activityrvAdapter (var context: Context, var data: ArrayList<rvData1>): RecyclerView.Adapter<activityrvAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): activityrvAdapter.ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: activityrvAdapter.ViewHolder, position: Int) {
        holder.txtview.setText(data[position].txt)

        holder.relativeLayout.setOnClickListener(View.OnClickListener { view ->
            when (position) {
                0 -> {
                    val intent = Intent(view.context, textView::class.java)
                    view.context.startActivity(intent)
                }

                1 -> {
                    val intent = Intent(view.context, EditText::class.java)
                    view.context.startActivity(intent)
                }

                2 -> {
                    val intent = Intent(view.context, button::class.java)
                    view.context.startActivity(intent)
                }

                3 -> {
                    val intent = Intent(view.context, imageView::class.java)
                    view.context.startActivity(intent)
                }

                4 -> {
                    val intent = Intent(view.context, imageButton::class.java)
                    view.context.startActivity(intent)
                }

                5 -> {
                    val intent = Intent(view.context, radioButton::class.java)
                    view.context.startActivity(intent)
                }

                6 -> {
                    val intent = Intent(view.context, checkbox::class.java)
                    view.context.startActivity(intent)
                }

                7 ->
                {
                    val intent = Intent(view.context, spinner::class.java)
                    view.context.startActivity(intent)
                }
            }
        })




    }
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var txtview = view.activity_tv
        var relativeLayout = view.activity_relativeLayout
    }
}