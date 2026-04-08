package com.example.topsoccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    //array of top soccer teams in SA
    val teams = arrayOf<String>("Mam Sundowns FC", "Orlando Pirates", "Bidvest Wits",
        "Stellenbosch FC", "Sek United FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creating variable to hold textview tex
        val teamsTxt = findViewById<TextView>(R.id.teamsDisplayId)

        //reassigned position 0 of teams array to a new value
        teams[0] = "Mam Sundowns FC :)"

        //assigning array content to a variable
        var teamDisplay = ""
        var count = 0

        while (count < teams.count()){
            teamDisplay += "${teams[count]}\n"
            count++
        }
//        teamDisplay += "${teams[0]}\n"
//        teamDisplay += "${teams[1]}\n"
//        teamDisplay += "${teams[2]}\n"
//        teamDisplay += "${teams[3]}\n"
//        teamDisplay += "${teams[4]}\n"

        //displaying array content in the textview
        teamsTxt.text = teamDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}