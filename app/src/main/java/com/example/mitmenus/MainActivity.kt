package com.example.mitmenus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mytextview = findViewById<TextView>(R.id.MyTextview)

        registerForContextMenu(mytextview)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if(id == R.id.history){
            var myIntent = Intent(this, HistoryActivity::class.java)
            startActivity(myIntent)
        }
        if(id == R.id.help){
            Toast.makeText(this, "HELP !!!", Toast.LENGTH_LONG).show()
            Log.i("mytag","showing help")
        }

        if(id == R.id.search){
            var myIntent = Intent(this, HistoryActivity::class.java)
            startActivity(myIntent)
        }

        return super.onOptionsItemSelected(item)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.mymenu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        var id = item.itemId

        if(id == R.id.history){
            var myIntent = Intent(this, HistoryActivity::class.java)
            startActivity(myIntent)
        }
        return super.onContextItemSelected(item)
    }
}