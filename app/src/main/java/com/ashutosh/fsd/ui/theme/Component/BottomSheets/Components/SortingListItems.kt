package com.ashutosh.fsd.ui.theme.Component.BottomSheets.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SortingListItems(modifier: Modifier = Modifier) {

    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.Cyan)
        ) {

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.Red)
        ) {

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.Yellow)
        ) {

        }
    }


}