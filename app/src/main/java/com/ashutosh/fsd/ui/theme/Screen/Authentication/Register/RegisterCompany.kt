package com.ashutosh.fsd.ui.theme.Screen.Authentication.Register


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.Email
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
import androidx.navigation.NavHostController
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component.TextField
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component.TextFieldFixed
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component.dropdownMenuBranch
import com.ashutosh.fsd.ui.theme.Theme.background

@Composable
fun RegisterCompany(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(background())
            .padding(25.dp)
            .verticalScroll(rememberScrollState()) ,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "Company Details" ,
            modifier = Modifier
                .wrapContentWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 30.dp) ,
            color = Color.White ,
            textAlign = TextAlign.Center ,
            fontSize = 20.sp ,
            fontWeight = FontWeight.ExtraBold
        )

        Text(
            text = "Complete Your Details:" ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp) ,
            color = Color.White ,
            textAlign = TextAlign.Start ,
            fontSize = 16.sp ,
            fontWeight = FontWeight.ExtraBold
        )

        TextFieldFixed(Icons.Filled.Person , "Ashutosh Pandey" , "")
        TextFieldFixed(Icons.Filled.Home , "Kanpur", "")
        TextFieldFixed(Icons.Filled.Phone , "638641582" , "+91-")
        TextField(Icons.Outlined.Email , "College Roll Number" , "")
        TextField(Icons.Outlined.Email , "Email" , "")
        TextField(Icons.Filled.AccountBox , "Course" , "")

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(14.dp))

        var selected  = dropdownMenuBranch()

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(14.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

            Button(
                enabled = true,

                onClick = {

                } ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFCC9913) ,
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
                AnimatedVisibility(
                    visible = true ,
                    enter = fadeIn() ,
                    exit = fadeOut()
                ) {

                    Text(
                        text = "Submit" , color = Color.White ,
                        fontSize = 20.sp ,
                        modifier = Modifier.padding(8.dp)
                    )

                }


            }
        }

    }





}