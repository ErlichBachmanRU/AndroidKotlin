package com.example.androidkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.androidkotlin.R.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        lateinit var button: Button
        button = findViewById(id.first_button)
        button.setOnClickListener(buttonClick)

        val weather = Weather(1, "Москва", "15")
        val texteviewCiti: TextView = findViewById(id.citi)
        val texteviewTemp: TextView = findViewById(id.temp)
        texteviewTemp.text = weather.temperature
        texteviewCiti.text = weather.City

    }

    var buttonClick = View.OnClickListener { view ->
        when (view.id) {

            id.first_button ->
                Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show()
        }
    }


}