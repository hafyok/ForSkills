package com.example.forskills.Presentation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AirTicketsScreen(navController: NavController) {
    Button(onClick = { navController.navigate("details") }) {
        Text(text = "Go to Details")
    }
}

