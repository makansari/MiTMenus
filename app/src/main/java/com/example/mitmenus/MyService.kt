package com.example.mitmenus

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    lateinit var mp : MediaPlayer

   var obj :Binder = Binder()
    override fun onBind(intent: Intent): IBinder? {
        return obj
    }

    override fun onCreate() {
        super.onCreate()
        mp = MediaPlayer.create(this, R.raw.mymusic)
        Log.i("mytag","service created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.i("mytag","service started")

        mp.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.stop()
        Log.i("mytag","service stopped")
    }
}