package com.ashutosh.growappassignment.ui.theme.Component.Tabs

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ashutosh.fsd.Presentation.ExploreViewModel
import com.ashutosh.fsd.R
import com.ashutosh.growappassignment.ui.theme.Component.CardLayout.CardFolderLayout


data class SupportCardList(
    val icon: Int,
    val name: String,
    val price: String,
    val perc: String
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TopGainer(navController: NavController) {

    val exploreViewModel: ExploreViewModel = hiltViewModel()

    val context = LocalContext.current

    val itemsList = listOf(
        SupportCardList(icon = R.drawable.folder2, name = "Item 1", price = "$100", perc = "+5%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 2", price = "$200", perc = "+3%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 3", price = "$150", perc = "-2%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 4", price = "$120", perc = "+7%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 5", price = "$180", perc = "-1%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 6", price = "$220", perc = "+4%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 7", price = "$140", perc = "+2%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 8", price = "$160", perc = "-3%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 9", price = "$130", perc = "+6%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 10", price = "$170", perc = "+1%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 1", price = "$100", perc = "+5%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 2", price = "$200", perc = "+3%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 3", price = "$150", perc = "-2%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 4", price = "$120", perc = "+7%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 5", price = "$180", perc = "-1%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 6", price = "$220", perc = "+4%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 7", price = "$140", perc = "+2%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 8", price = "$160", perc = "-3%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 9", price = "$130", perc = "+6%"),
        SupportCardList(icon = R.drawable.folder2, name = "Item 10", price = "$170", perc = "+1%")
    )

    val ItemsList = remember {
        mutableStateOf(itemsList)
    }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                ,
                verticalArrangement = Arrangement.Top ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                )

                if (ItemsList.value != null && ItemsList.value!!.isNotEmpty()) {

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2) ,
                        modifier = Modifier
                            .fillMaxSize() ,
                        userScrollEnabled = true ,

                        contentPadding = PaddingValues(
                            start = 12.dp ,
                            top = 16.dp ,
                            end = 12.dp ,
                            bottom = 80.dp
                        ) ,
                        content = {

                            ItemsList?.let {
                                items(ItemsList.value!!.size) { it ->

                                    CardFolderLayout(
                                        ItemsList.value!!.get(it).icon,
                                        ItemsList.value!!.get(it).name ,
                                        ItemsList.value!!.get(it).price ,
                                        ItemsList.value!!.get(it).perc,
                                    ){
                                        Toast.makeText(context, "This is a Toast message!", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        }
                    )
                }

            }



}