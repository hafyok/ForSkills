package com.example.forskills.Presentation.AirTicket

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.forskills.R

@Composable
fun AirTicketsScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.cheapTickets),
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            maxLines = 2,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        SearchForm()

        Text(
            text = stringResource(id = R.string.musicOut),
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            maxLines = 2,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 24.dp)
        )

        val offers = listOf(
            listOf("Die Antwoord", "Будапешт", R.drawable.dora, "22 264"),
            listOf("Socrat& Lera", "Санкт-Петербург", R.drawable.socrat_lera, "2 390"),
            listOf("Лампабикт", "Москва", R.drawable.lampabict, "2 390"),
        )
        LazyRow() {
            items(offers) { offer ->
                OfferItem(
                    title = offer[0].toString(),
                    city = offer[1].toString(),
                    image = offer[2].toString().toInt(),
                    price = offer[3].toString()
                )
                Spacer(modifier = Modifier.width(68.dp))
            }
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewAirTicketsScreen() {
    val navController = rememberNavController()
    AirTicketsScreen(navController)
}