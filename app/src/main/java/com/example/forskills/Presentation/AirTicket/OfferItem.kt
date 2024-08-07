package com.example.forskills.Presentation.AirTicket

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forskills.R
import com.example.forskills.ui.theme.*

@Composable
fun OfferItem(title: String, city: String, image: Int, price: String) {
    val id = IMAGE_ID.chooseImage(image)
    Column() {
        Image(
            painter = painterResource(id = id),
            contentDescription = null,
            modifier = Modifier.size(132.dp)
        )
        Spacer(modifier = Modifier.padding(6.dp))
        Text(text = title, color = White, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = city, color = White, fontSize = 14.sp)
        Spacer(modifier = Modifier.padding(4.dp))
        Row {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_air_offers),
                contentDescription = null,
                tint = Grey6
            )
            Text(text = " от $price Р", color = White, fontSize = 14.sp)
        }

    }
}

object IMAGE_ID {
    fun chooseImage(id: Int) = when (id) {
            1 -> R.drawable.dora
            2 -> R.drawable.socrat_lera
            3 -> R.drawable.lampabict
        else -> {R.drawable.ic_air_offers}
    }
}
