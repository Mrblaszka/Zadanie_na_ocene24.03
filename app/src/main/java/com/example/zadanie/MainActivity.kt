package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val men = findViewById<RadioButton>(R.id.m)
            if(men.isSelected){
                findViewById<TextView>(R.id.lista).text = "Mężczyzna"
            }
        val grl = findViewById<RadioButton>(R.id.k)
            if(grl.isSelected){
                findViewById<TextView>(R.id.lista).text = "Kobieta"
            }


    }
}