package com.ashutosh.growappassignment.ui.theme.Screen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ashutosh.fsd.ui.theme.FSDTheme
import com.ashutosh.fsd.ui.theme.Theme.MainEvent
import com.ashutosh.fsd.ui.theme.Theme.MainState
import com.ashutosh.fsd.ui.theme.Theme.h2TextStyle
import com.ashutosh.growappassignment.ui.theme.Component.NavigationDrawerComponent
import com.ashutosh.growappassignment.ui.theme.Component.Tabs.CardFolderPage
import com.ashutosh.growappassignment.ui.theme.Component.Tabs.ListFolderPage


import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Explore(navController: NavController , appState: MainState ,
            onMainEvent: (MainEvent) -> Unit) {


    var showListView by remember {
        mutableStateOf(false)
    }

    val context = LocalContext.current.applicationContext
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)


    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(drawerContainerColor = MaterialTheme.colorScheme.primary) {
                NavigationDrawerComponent(
                    appState,
                    onMainEvent,
                    onClickNews = {
                        scope.launch {
                            drawerState.close()
                        }
                    }
                )
            }
        }) {
        Scaffold(modifier = Modifier.fillMaxSize() ,
        topBar = {
            TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent
            ),
            title = {
                Text(
                    text = "File System Drive",
                    style = h2TextStyle
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    scope.launch {
                        drawerState.apply {
                            if (isClosed) open() else close()
                        }
                    }
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            })
        } ,
        bottomBar = {


        },
        content = {

            Column {

                Spacer(modifier = Modifier.size(70.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Row(modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight() ,
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Name" ,
                            color = Color(0xFFF6F6F6) ,
                            fontSize = 14.sp
                        )

                        Icon(
                            imageVector = Icons.Default.KeyboardArrowUp ,
                            contentDescription = "Sorting" ,
                            tint = Color(0xFFA7A7A7) ,
                            modifier = Modifier
                                .size(30.dp)
                                .clickable {

                                }
                        )
                    }


                    Icon(
                        imageVector = Icons.Filled.List ,
                        contentDescription = "Sorting" ,
                        tint = Color(0xFFA7A7A7) ,
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                showListView = !showListView
                                Toast
                                    .makeText(
                                        context ,
                                        "Show List Value is ${showListView}" ,
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                    )

                }


                if (showListView) {
                    CardFolderPage(navController)
                } else {
                    ListFolderPage(navController)
                }
            }
        }
    )
    }
}



@Preview()
@Composable
fun ExplorePreview() {
    FSDTheme{

    }
}
