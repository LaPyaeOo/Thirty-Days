package com.example.thirtydays

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.thirtydays.model.Day

@Composable
fun ThirtyDaysList(
    days: List<Day>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding) {
        itemsIndexed(days) { _, day ->
            DaysCard(day = day, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        }
    }
}

@Composable
fun DaysCard(day: Day, modifier: Modifier = Modifier) {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 2.dp), modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 72.dp)
        ) {
            Text(
                text = stringResource(day.dayRes),
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = stringResource(day.titleRes),
                style = MaterialTheme.typography.displayMedium
            )
            Box(modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(8.dp))) {
                Image(
                    painter = painterResource(day.imageRes),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}