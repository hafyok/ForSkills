package com.example.forskills

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


sealed class BottomNavItem(val route: String, @StringRes val title: Int, @DrawableRes val icon: Int) {
    data object AirTickets : BottomNavItem("airTickets", R.string.airTickets, R.drawable.ic_air_ticket)
    data object Hotels : BottomNavItem("hotels", R.string.hotels, R.drawable.ic_hotels)
    data object InShort: BottomNavItem("inShort", R.string.inShort, R.drawable.ic_in_short)
    data object Subscribes: BottomNavItem("subscribes", R.string.subscribes, R.drawable.ic_subs)
    data object Profile : BottomNavItem("profile", R.string.profile, R.drawable.ic_profile)


}