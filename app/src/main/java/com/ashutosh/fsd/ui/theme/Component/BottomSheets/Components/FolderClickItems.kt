package com.ashutosh.fsd.ui.theme.Component.BottomSheets.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashutosh.fsd.R

@Composable
fun FolderClickItems() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .background(Color.White)){

        BottomSheetOptions(R.drawable.folder2,"App Name") {}
        Divider()
        BottomSheetOptions(R.drawable.folder2,"Manage Access") {}
        BottomSheetOptions(R.drawable.folder2,"Add to Starred") {}
        BottomSheetOptions(R.drawable.folder2,"Copy Link") {}
        Divider()
        BottomSheetOptions(R.drawable.folder2,"Rename") {}
        Divider()
        BottomSheetOptions(R.drawable.folder2,"Change Color") {}
        BottomSheetOptions(R.drawable.folder2,"Add Shortcut to Drive") {}
        BottomSheetOptions(R.drawable.folder2,"Move") {}
        BottomSheetOptions(R.drawable.folder2,"Details and Activity") {}
        BottomSheetOptions(R.drawable.folder2,"Add to Home Screen") {}
        BottomSheetOptions(R.drawable.folder2,"Remove") {}

    }
}

@Composable
fun BottomSheetOptions(icon: Int , str: String , onClick: () -> Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        , verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start){

        Icon(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .padding(vertical = 5.dp)
                .size(30.dp)
                .clickable {

                },
            painter = painterResource(id = icon), contentDescription = "icon",
            tint = Color.DarkGray)

        Text(
            text = str ,
            color = Color.DarkGray ,
            fontSize = 18.sp ,
            maxLines = 1 ,
            softWrap = true ,
            overflow = TextOverflow.Ellipsis
        )


    }
}
