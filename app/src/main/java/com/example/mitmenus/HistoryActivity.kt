package com.example.mitmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        var searchImageview = findViewById<ImageView>(R.id.himageViewSearch)

        var myButton = findViewById<Button>(R.id.buttonPopmenu)

        myButton.setOnClickListener {
            var popMenu = PopupMenu(this,myButton)
            popMenu.menuInflater.inflate(R.menu.mymenu, popMenu.menu)
            popMenu.show()

            popMenu.setOnMenuItemClickListener {
                var id = it.itemId
                if(id == R.id.history){
                    Log.i("mytag","popup menu")
                }

                true
            }
        }


    }
}