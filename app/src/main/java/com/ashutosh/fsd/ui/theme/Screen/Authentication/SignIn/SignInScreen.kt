package com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ashutosh.fsd.Navigation.Routes
import com.ashutosh.fsd.Presentation.AuthenticationViewModel
import com.ashutosh.fsd.R
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.Component.Password
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.Component.numberTextField
import com.ashutosh.fsd.ui.theme.Theme.background

@Composable
fun SignInScreen(navController: NavHostController) {
    val context = LocalContext.current.applicationContext
    val authVM : AuthenticationViewModel = hiltViewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = background()) ,
        verticalArrangement = Arrangement.Center
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(18.dp)
                .verticalScroll(rememberScrollState()) ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                painter = painterResource(id = R.drawable.google_drive) ,
                contentDescription = null ,
                contentScale = ContentScale.Fit ,
                modifier = Modifier
                    .padding(horizontal = 40.dp)
                    .height(150.dp)
                    .fillMaxWidth() ,

                )


            Text(
                text = "Sign In" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .padding(horizontal = 30.dp) ,
                color = Color.White ,
                textAlign = TextAlign.Center ,
                fontSize = 40.sp ,
                fontWeight = FontWeight.ExtraBold

            )

            authVM.phoneNo = "+91" + numberTextField(Icons.Outlined.Phone , "" , "+91")
            authVM.password = Password(Icons.Outlined.Lock , "password" , "")


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 10.dp) ,
                horizontalAlignment = Alignment.End
            ) {

                Text(text = "Forgot Password?" ,
                    color = Color(0xFFCC9913) ,
                    fontSize = 12.sp ,
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                        navController.navigate(Routes.ResetPassword.name)
                    })
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {

                Button(
                    enabled = true
//                    ((authVM.phoneNo.isNotEmpty()
//                            && authVM.password.isNotEmpty())
//                            )
                    ,
                    onClick = {
                        navController.popBackStack()
                        navController.navigate(Routes.Explore.name)
                    } ,
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFCC9913) ,
                        disabledContainerColor = Color.DarkGray
                    ) ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp) ,
                    shape = RoundedCornerShape(
                        topEnd = 10.dp ,
                        topStart = 10.dp ,
                        bottomEnd = 10.dp ,
                        bottomStart = 10.dp
                    )
                ) {
                        Text(
                            text = "Sign In" , color = Color.White ,
                            fontSize = 20.sp ,
                            modifier = Modifier.padding(8.dp)
                        )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 10.dp) ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {

                    Text(
                        text = "Don't have an Account?" ,
                        color = Color(0xFFF6F6F6) ,
                        fontSize = 12.sp
                    )

                    Text(text = "Sign Up" ,
                        color = Color(0xFFCC9913) ,
                        fontSize = 12.sp ,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .clickable {
                                navController.popBackStack()
                                navController.navigate(Routes.Register.name)
                            })
                }
            }

        }

    }


}