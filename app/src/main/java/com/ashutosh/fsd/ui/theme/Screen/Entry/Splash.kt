package com.ashutosh.growappassignment.ui.theme.Screen

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.ashutosh.fsd.Navigation.Routes
import com.ashutosh.fsd.Presentation.ExploreViewModel
import com.ashutosh.fsd.R
import com.ashutosh.fsd.ui.theme.FSDTheme
import com.ashutosh.fsd.ui.theme.Theme.MainState
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Splash(navController: NavHostController , appState: MainState) {

    val exploreViewModel: ExploreViewModel = hiltViewModel()

    val textVisibility = remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = true) {
        textVisibility.value = true
        delay(2000)
        textVisibility.value = false
        delay(1400)
        navController.popBackStack()
        navController.navigate(Routes.AuthenticationGraph.name)
    }


    Scaffold(modifier = Modifier
        .fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize() ,
                verticalArrangement = Arrangement.Center ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.file_blue))
                val progress by animateLottieCompositionAsState(composition = composition, restartOnPlay = true,
                    iterations = LottieConstants.IterateForever)


                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center)
                {

                    LottieAnimation(
                        modifier = Modifier.size(200.dp),
                        composition = composition,
                        progress = {progress})

                    this@Column.AnimatedVisibility(visible = textVisibility.value,
                        exit = fadeOut(animationSpec = tween(durationMillis = 500)),
                        enter = fadeIn(animationSpec = tween(durationMillis = 500))){
                        Text(
                            text = "FSD" ,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight() ,
                            color = MaterialTheme.colorScheme.onSecondary ,
                            fontSize = 28.sp ,
                            fontStyle = FontStyle.Normal ,
                            fontWeight = FontWeight.Medium ,
                            textAlign = TextAlign.Center ,
                            letterSpacing = 2.sp
                        )
                    }

                }





            }
        }
    )
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview()
@Composable
fun SplashPreview() {
    FSDTheme{
        Scaffold(modifier = Modifier
            .fillMaxSize(),
            content = {

                Column(
                    modifier = Modifier
                        .fillMaxSize() ,
                    verticalArrangement = Arrangement.Center ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.file_blue))
                    val progress by animateLottieCompositionAsState(composition = composition, restartOnPlay = true,
                        iterations = LottieConstants.IterateForever)


                    Box(modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center)
                    {

                        LottieAnimation(
                            modifier = Modifier.size(200.dp),
                            composition = composition,
                            progress = {progress})

                        Text(text = "FSD",
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            color = MaterialTheme.colorScheme.onSecondary,
                            fontSize = 28.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            letterSpacing = 2.sp
                        )

                    }





                }
            }
        )
    }
}