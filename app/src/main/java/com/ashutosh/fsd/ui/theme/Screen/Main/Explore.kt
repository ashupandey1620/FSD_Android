package com.ashutosh.growappassignment.ui.theme.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ashutosh.fsd.ui.theme.FSDTheme
import com.ashutosh.fsd.ui.theme.Theme.MainEvent
import com.ashutosh.fsd.ui.theme.Theme.MainState
import com.ashutosh.fsd.ui.theme.Theme.h2TextStyle
import com.ashutosh.growappassignment.ui.theme.Component.NavigationDrawerComponent
import com.ashutosh.growappassignment.ui.theme.Component.Tabs.TopGainer

import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Explore(navController: NavController , appState: MainState ,
            onMainEvent: (MainEvent) -> Unit) {


    var selectedIndex by remember {
        mutableStateOf(0)
    }

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

            if(selectedIndex==0){
                TopGainer(navController)
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
