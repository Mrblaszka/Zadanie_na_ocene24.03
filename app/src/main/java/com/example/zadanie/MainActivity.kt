package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wiek = findViewById<EditText>(R.id.wiek2)
        var koniec = ""
        val men = findViewById<RadioButton>(R.id.m)
            if(men.isChecked){
               koniec += "Mężczyzna"
            }
        val grl = findViewById<RadioButton>(R.id.k)
            if(grl.isChecked){
                koniec += "Kobieta"
            }

        val sport = findViewById<CheckBox>(R.id.cb1)
        if(sport.isChecked){
                koniec += "sport"
        }

        val msc = findViewById<CheckBox>(R.id.cb2)
        if(msc.isChecked){
            koniec += "muzyka"
        }

        val tr = findViewById<CheckBox>(R.id.cb3)
        if(tr.isChecked){
            koniec += "turystyka"
        }

        val games = findViewById<CheckBox>(R.id.cb1)
        if(games.isChecked){
            koniec += "gry"
        }

        val send = findViewById<Button>(R.id.wyslij)
        send.setOnClickListener(){
            men.isEnabled = false
            grl.isEnabled = false
            sport.isEnabled = false
            msc.isEnabled = false
            tr.isEnabled = false
            games.isEnabled = false
            wiek.isEnabled = false
            val lista = koniec.also { findViewById<TextView>(R.id.lista).text = it }
        }
        send.setOnClickListener(){
            men.isEnabled = true
            grl.isEnabled = true
            sport.isEnabled = true
            msc.isEnabled = true
            tr.isEnabled = true
            games.isEnabled = true
            wiek.isEnabled = true
            val lista = koniec.also { findViewById<TextView>(R.id.lista).text = it }
        }
    }
}