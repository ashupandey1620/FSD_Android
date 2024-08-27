package com.ashutosh.fsd.ui.theme.Screen.Authentication.Register

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ashutosh.fsd.Presentation.AuthenticationViewModel
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component.TextField
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component.dropdownMenu
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.Component.Password
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.Component.numberTextField
import com.ashutosh.fsd.ui.theme.Theme.background

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {

    val authVM : AuthenticationViewModel = hiltViewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = background()),
        Arrangement.Center
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(18.dp)
                .verticalScroll(rememberScrollState()) ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = "Sign Up" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .padding(horizontal = 30.dp) ,
                color = Color.White ,
                textAlign = TextAlign.Center ,
                fontSize = 40.sp ,
                fontWeight = FontWeight.ExtraBold)

            authVM.name = TextField(Icons.Outlined.Person , "Your Name" , "")

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(14.dp))

            authVM.college =  dropdownMenu(authVM.college)

            authVM.phone = numberTextField(Icons.Outlined.Phone , "" , "+91")




            if (authVM.isVerified) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 5.dp) ,
                    horizontalAlignment = Alignment.End
                ) {

                    Text(
                        text = "Verified" ,
                        color = Color.Green ,
                        fontSize = 12.sp
                    )
                }
            }
//            else {
//                Verify(authVM , ctx , navController)
//            }


            authVM.password1 = Password(Icons.Outlined.Lock , "Your Password" , "")
            authVM.password2 = Password(Icons.Outlined.Lock , "Confirm Password" , "")


            Spacer(modifier = Modifier.padding(25.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {

                Button(
                    enabled = true,
//                    = authVM.name.value.isNotEmpty()
//                            && authVM.college.value.isNotEmpty()
//                            && authVM.phone.value.isNotEmpty()
//                            && authVM.password1.value.isNotEmpty()
//                            && authVM.password2.value.isNotEmpty()
//                            && authVM.password1.value == authVM.password2.value
//                            && authVM.isVerified.value
                    onClick = {
//                        navController.navigate(route = "more_details")

                    } ,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCC9913) ,
                        disabledContainerColor = Color.DarkGray) ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp) ,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Next" , color = Color.White ,
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
                        text = "Already have an Account?" ,
                        color = Color(0xFFF6F6F6) ,
//                        fontFamily = poppins ,
                        fontSize = 12.sp
                    )

                    Text(text = "Sign In" ,
                        color = Color(0xFFCC9913) ,
                        fontSize = 12.sp ,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .clickable {
//                                navController.popBackStack()
//                                navController.navigate("signIn_page")
                            })
                }
            }

        }


    }

}




