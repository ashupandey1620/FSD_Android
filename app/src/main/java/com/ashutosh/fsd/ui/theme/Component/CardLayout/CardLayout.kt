package com.ashutosh.growappassignment.ui.theme.Component.CardLayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ashutosh.fsd.R
import com.ashutosh.fsd.ui.theme.FSDTheme


@Composable
fun CardFolderLayout(
    icon: Int ,
    name: String ,
    price: String ,
    perc: String ,
//    navController: NavController ,
    onClick: () -> Unit
) {

        Box(modifier = Modifier
            .width(180.dp)
            .height(140.dp) ,
            contentAlignment = Alignment.BottomEnd) {
            Image(
                painter = painterResource(id = icon) ,
                contentDescription = null ,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxSize() ,
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier
                .padding(10.dp)
                .padding(15.dp)
                .size(35.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                Image(
                    painter = painterResource(R.drawable.file) ,
                    contentDescription = null ,
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            onClick()
                        },
                    contentScale = ContentScale.Crop
                )

            }

    }
}


@Preview()
@Composable
fun TeamItemPreview() {
    FSDTheme {

        CardFolderLayout(
            R.drawable.folder2,
            "Apple, Inc. (APPL)" ,
            "177.15" ,
            "0.88",
            {}
        )
    }

}
