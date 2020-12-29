package com.lalith.androidwithkotlin

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class simplenotifplayfragment : Fragment()
{
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder : Notification.Builder

    private var channelId = "com.lalith.androidwithkotlin"
    private var description = "Test Notification"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.simple_notif_play,container,false)
        var button = view.findViewById<Button>(R.id.btn_n)

        notificationManager = (activity!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)!!

        button.setOnClickListener {
            val intent = Intent(activity,MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(activity,0,intent, PendingIntent.FLAG_UPDATE_CURRENT)

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                notificationChannel = NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
                notificationChannel.enableLights(true)
                notificationChannel.lightColor = Color.WHITE
                notificationChannel.enableVibration(true)
                notificationManager.createNotificationChannel(notificationChannel)

                builder = Notification.Builder(activity,channelId)
                    .setContentTitle("Android with kotlin")
                    .setContentText("Test Notification")
                    .setSmallIcon(R.drawable.logo)
                    .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.logo))
                    .setContentIntent(pendingIntent)
            }
            else
            {
                builder = Notification.Builder(activity)
                    .setContentTitle("Android with kotlin")
                    .setContentText("Test Notification")
                    .setSmallIcon(R.drawable.logo)
                    .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.logo))
                    .setContentIntent(pendingIntent)
            }

            notificationManager.notify(1234,builder.build())
        }
        return view
    }
}