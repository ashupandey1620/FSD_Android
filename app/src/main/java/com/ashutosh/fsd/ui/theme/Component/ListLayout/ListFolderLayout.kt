package com.ashutosh.growappassignment.ui.theme.Component.CardLayout

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ashutosh.fsd.Navigation.Routes
import com.ashutosh.fsd.Presentation.ExploreViewModel
import com.ashutosh.fsd.R
import com.ashutosh.fsd.ui.theme.FSDTheme


@Composable
fun ListFolderLayout(
    icon: Int ,
    name: String ,
    description: String ,
    modifiedDate: String ,
    navController: NavController ,
    onClick: () -> Unit
) {

        val exploreVM : ExploreViewModel = hiltViewModel()


        Row(modifier = Modifier
            .padding(vertical = 5.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                navController.navigate(Routes.FolderInside.name)
            },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {


            Icon(
                painter = painterResource(id = icon) ,
                contentDescription = null ,
                modifier = Modifier
                    .fillMaxWidth(0.10f)
                    .size(30.dp) ,
            )


            Column(modifier = Modifier
                .fillMaxWidth(0.75f)
                .padding(vertical = 5.dp)
                .padding(horizontal = 10.dp)) {
                Text(
                    text = name ,
                    color = Color(0xFFF6F6F6) ,
                    fontSize = 16.sp ,
                    maxLines = 1 ,
                    softWrap = true ,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = description ,
                    color = Color(0xFFF6F6F6) ,
                    fontSize = 14.sp ,
                    maxLines = 1 ,
                    softWrap = true ,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "modified on $modifiedDate" ,
                    color = Color.Gray ,
                    fontSize = 14.sp ,
                    maxLines = 1 ,
                    softWrap = true ,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Icon(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .padding(vertical = 5.dp)
                    .size(30.dp)
                    .clickable {
                        exploreVM.isOpenFolderClick = !exploreVM.isOpenFolderClick
                    },
                imageVector = Icons.Filled.MoreVert , contentDescription = "icon" ,
                tint = Color.White
            )
        }
    Divider()

}






@Preview()
@Composable
fun ListItemPreview() {
//    FSDTheme {
//
//        ListFolderLayout(
//            R.drawable.folder ,
//            "Apple, Inc. (APPL)" ,
//            "177.15" ,
//            "0.88" ,
////            navController
//        ) {}
//    }

}
