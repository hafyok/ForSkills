package com.example.forskills

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.forskills.Presentation.AirTicket.AirTicketsScreen
import com.example.forskills.Presentation.HotelsScreen
import com.example.forskills.Presentation.InShortScreen
import com.example.forskills.Presentation.ProfileScreen
import com.example.forskills.Presentation.SubscribesScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = BottomNavItem.AirTickets.route, modifier = Modifier.padding(innerPadding)) {
            composable(BottomNavItem.AirTickets.route) { AirTicketsScreen(navController) }
            composable(BottomNavItem.Hotels.route) { HotelsScreen(navController) }
            composable(BottomNavItem.InShort.route) { InShortScreen() }
            composable(BottomNavItem.Subscribes.route) { SubscribesScreen() }
            composable(BottomNavItem.Profile.route) { ProfileScreen() }

        }
    }
}