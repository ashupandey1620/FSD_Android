package com.ashutosh.fsd.ui.theme.Component.NetworkRelated

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.ashutosh.fsd.R

@Composable
fun LoadingScreen() {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie2))
    val progress by animateLottieCompositionAsState(composition = composition, restartOnPlay = true,
        iterations = LottieConstants.IterateForever)


    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {

        LottieAnimation(
            modifier = Modifier.size(200.dp),
            composition = composition,
            progress = {progress})

    }
}