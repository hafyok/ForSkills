package com.example.forskills

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.example.forskills.Data.MainOffers
import com.example.forskills.ui.theme.ForSkillsTheme
import com.google.gson.Gson

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val json = """{
  "offers": [
    {
      "id": 1,
      "title": "Die Antwoord",
      "town": "Будапешт",
      "price": {
        "value": 5000
      }
    },
    {
      "id": 2,
      "title": "Socrat&Lera",
      "town": "Санкт-Петербург",
      "price": {
        "value": 1999
      }
    },
    {
      "id": 3,
      "title": "Лампабикт",
      "town": "Москва",
      "price": {
        "value": 2390
      }
    }
  ]
}"""
        val offers = Gson().fromJson(json, MainOffers::class.java)
        Log.d("JSON", offers.toString())
        enableEdgeToEdge()
        setContent {
            ForSkillsTheme {
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}
