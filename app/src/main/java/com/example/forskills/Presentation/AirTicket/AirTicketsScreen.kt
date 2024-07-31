package com.example.forskills.Presentation.AirTicket

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.forskills.R
import com.example.forskills.ui.theme.Black
import com.example.forskills.ui.theme.Grey3
import com.example.forskills.ui.theme.Grey4
import com.example.forskills.ui.theme.Grey5
import com.example.forskills.ui.theme.Grey6
import com.example.forskills.ui.theme.White

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
            textAlign = TextAlign.Center,
            maxLines = 2,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Grey3),
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Grey4),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .shadow(4.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = Black
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(
                            // Моковые данные
                            text = "Минск",
                            color = White,
                        )
                        HorizontalDivider(
                            color = Grey5,
                            thickness = 2.dp,
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                        Text(
                            // Моковые данные
                            text = "Куда - Турция",
                            color = Grey6,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAirTicketsScreen() {
    val navController = rememberNavController()
    AirTicketsScreen(navController)
}