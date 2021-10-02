package com.example.androidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.androidkotlin.R

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.first_button)
        button.setOnClickListener(buttonClick)
    }

    var buttonClick = View.OnClickListener { view ->
        when (view.id) {
            R.id.first_button -> {
                Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show()
            }
        }
    }


}