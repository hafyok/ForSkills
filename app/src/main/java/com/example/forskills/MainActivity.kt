package com.example.forskills

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.example.forskills.Data.OffersApi
import com.example.forskills.Data.RetrofitHelper
import com.example.forskills.ui.theme.ForSkillsTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val offersApi = RetrofitHelper.getInstance().create(OffersApi::class.java)
        // launching a new coroutine
        CoroutineScope(Dispatchers.IO).launch {
            val result = offersApi.getOffers("https://drive.usercontent.google.com/u/0/uc?id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav&export=download")
            if (result.isSuccessful) {
                val offers = result.body()
                Log.d("Offers: ", offers.toString())
            } else {
                Log.e("Error: ", result.errorBody().toString())
            }
        }
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
