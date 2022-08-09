package com.example.mitmenus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        var startButton = findViewById<Button>(R.id.buttonStart)
        var stopButton = findViewById<Button>(R.id.buttonStop)

        startButton.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            startService(i)
        }

        stopButton.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            stopService(i)
        }
    }
}