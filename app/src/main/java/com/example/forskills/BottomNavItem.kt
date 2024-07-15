package com.example.forskills

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


sealed class BottomNavItem(val route: String, @StringRes val title: Int, @DrawableRes val icon: Int) {
    object AirTickets : BottomNavItem("airTickets", R.string.airTickets, R.drawable.ic_launcher_foreground)
    object Hotels : BottomNavItem("hotels", R.string.hotels, R.drawable.ic_launcher_foreground)
    object InShort: BottomNavItem("inShort", R.string.inShort, R.drawable.ic_launcher_foreground)
    object Subscribes: BottomNavItem("subscribes", R.string.subscribes, R.drawable.ic_launcher_foreground)
    object Profile : BottomNavItem("profile", R.string.profile, R.drawable.ic_launcher_foreground)


}