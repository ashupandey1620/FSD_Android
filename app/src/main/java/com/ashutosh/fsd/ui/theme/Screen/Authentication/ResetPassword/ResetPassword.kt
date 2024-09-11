package com.ashutosh.fsd.ui.theme.Screen.Authentication.ResetPassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ashutosh.fsd.Presentation.AuthenticationViewModel
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.Component.Password
import com.ashutosh.fsd.ui.theme.Theme.background

@Composable
fun ResetPassword(modifier: Modifier = Modifier) {

    val authVM : AuthenticationViewModel = hiltViewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(30.dp)
    ) {

        Text(
            text = "Reset Password Screen" ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 30.dp) ,
            color = Color.White ,
            textAlign = TextAlign.Center ,
            fontSize = 30.sp ,
            fontWeight = FontWeight.ExtraBold

        )


        Text(
            text = "Create Your New password:" ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
            ,
            color = Color.White ,
            textAlign = TextAlign.Start ,
            fontSize = 16.sp ,
            fontWeight = FontWeight.ExtraBold

        )

        authVM.password1 = Password(Icons.Outlined.Lock , "Your Password" , "")
        authVM.password2 = Password(Icons.Outlined.Lock , "Confirm Password" , "")


        Button(
            enabled = authVM.password1.isNotEmpty()
                    && authVM.password2.isNotEmpty()
                    && authVM.password1 == authVM.password2,
            onClick = {



            } ,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCC9913) ,
                disabledContainerColor = Color.DarkGray) ,
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .fillMaxWidth()
                .padding(top = 30.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                text = "Continue" , color = Color.White ,
                fontSize = 20.sp ,
                modifier = Modifier.padding(8.dp)
            )
        }
    }

}