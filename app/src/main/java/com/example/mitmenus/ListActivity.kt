package com.example.mitmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {

    var countries = arrayOf("INDIA", "ENGLAND", "USA", "NEPAL","INDIA","INDIA", "ENGLAND", "USA", "NEPAL","INDIA", "ENGLAND", "USA", "NEPAL","INDIA", "ENGLAND", "USA", "NEPAL")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var myListView = findViewById<ListView>(R.id.myListView)

       // var myArrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
        var myArrayAdapter = ArrayAdapter(this,R.layout.item_layout, R.id.textViewItem,countries)

        myListView.adapter = myArrayAdapter

        myListView.setOnItemClickListener { adapterView, view, position, id ->

            var item = adapterView.getItemAtPosition(position).toString()
            Log.i("mytag", item + " position is $position and id is $id")

        }

    }

}