package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var koniec = ""
        val men = findViewById<RadioButton>(R.id.m)
        val grl = findViewById<RadioButton>(R.id.k)
        val wiek = findViewById<EditText>(R.id.wiek2)
        val wiek1 = wiek.text.toString().toInt()
        val sport = findViewById<CheckBox>(R.id.cb1)
        val msc = findViewById<CheckBox>(R.id.cb2)
        val tr = findViewById<CheckBox>(R.id.cb3)
        val games = findViewById<CheckBox>(R.id.cb1)
        val send = findViewById<Button>(R.id.wyslij)
        send.setOnClickListener{
            if(men.isChecked){
                koniec += "Mężczyzna "
                grl.isEnabled = false
            }

            if(grl.isChecked){
                koniec += "Kobieta "
                men.isEnabled = false
            }

            if(wiek1 > 0) {
                koniec += wiek
            }
            else{
                error("Wiek musi być większy niż zero")
            }


            if(sport.isChecked){
                koniec += "sport "
            }


            if(msc.isChecked){
                koniec += "muzyka "
            }


            if(tr.isChecked){
                koniec += "turystyka "
            }

            if(games.isChecked){
                koniec += "gry "
            }
            findViewById<TextView>(R.id.lista).text = ""
            findViewById<TextView>(R.id.lista).text = koniec + "" + wiek
            men.isEnabled = false
            grl.isEnabled = false
            sport.isEnabled = false
            msc.isEnabled = false
            tr.isEnabled = false
            games.isEnabled = false
            wiek.isEnabled = false
        }

    }
}