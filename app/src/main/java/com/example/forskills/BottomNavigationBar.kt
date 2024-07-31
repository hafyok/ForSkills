package com.example.forskills

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.forskills.ui.theme.Black
import com.example.forskills.ui.theme.Blue
import com.example.forskills.ui.theme.Grey6
import com.example.forskills.ui.theme.White

//import com.example.forskills.ui.theme.*

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.AirTickets,
        BottomNavItem.Hotels,
        BottomNavItem.InShort,
        BottomNavItem.Subscribes,
        BottomNavItem.Profile
    )
    BottomAppBar(
        containerColor = Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = item.icon),
                        contentDescription = null,
                        tint = if (currentRoute == item.route) Blue else Grey6 // Orange if selected, White if not
                    )
                },
                label = {
                    Text(
                        text = stringResource(id = item.title),
                        fontSize = 9.sp,
                        maxLines = 1,
                        color = if (currentRoute == item.route) Blue else Grey6 // Orange if selected, White if not
                    )
                },
                selected = currentRoute == item.route,
                selectedContentColor = Blue,
                unselectedContentColor = White,
                onClick = {
                    navController.navigate(item.route) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                    }
                }
            )
        }
    }
}

@Composable
@Preview
fun PreviewNavBar() {
    val navController = rememberNavController()
    BottomNavigationBar(navController)
}
