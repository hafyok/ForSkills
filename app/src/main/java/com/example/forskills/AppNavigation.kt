package com.example.forskills

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.forskills.Presentation.AirTicketsScreen
import com.example.forskills.Presentation.HotelsScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { AirTicketsScreen(navController) }
        composable("details") { HotelsScreen(navController) }
    }
}