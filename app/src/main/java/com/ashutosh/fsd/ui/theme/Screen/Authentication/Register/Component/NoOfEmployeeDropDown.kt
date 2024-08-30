package com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun noOfEmployeeDropDown(value: String):String {

//    val sharedViewModel:SharedViewModel = hiltViewModel()



    var isExpanded by remember {
        mutableStateOf(false)
    }

    var type  by remember {
        mutableStateOf(value)
    }

    var typeToReturn by remember {
        mutableStateOf(value)
    }


    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { newValue ->
            isExpanded = newValue
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        val containerColor = Color(0xFF222222)
        OutlinedTextField(
            value = type ,
            onValueChange = {},
            readOnly = true,

            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = { Text(text = "Number Of Employees", color = Color(0xFFA7A7A7),
              fontSize = 14.sp) },

            colors = ExposedDropdownMenuDefaults.textFieldColors(
                focusedTextColor = Color.White ,
                unfocusedTextColor = Color.White,
                focusedContainerColor = containerColor ,
                unfocusedContainerColor = containerColor ,
                disabledContainerColor = containerColor ,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor(),
            leadingIcon = {
                Icon(
                    Icons.Filled.Home, contentDescription = "icon",
                    tint = Color(0xFFA7A7A7))
            },
            shape = RoundedCornerShape(10.dp) ,

            )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = {
                isExpanded = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "50 - 200 Employees")
                },
                onClick = {
                    type = "50-200 Account"
                    typeToReturn = "1"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "201 - 1000 Employees")
                },
                onClick = {
                    type = "201-1000 Account"
                    typeToReturn = "2"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "1001 - 50000 Employees")
                },
                onClick = {
                    type = "1001-50000 Account"
                    typeToReturn = "3"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "More than 50000+ Employees")
                },
                onClick = {
                    type = ">50000"
                    typeToReturn = "4"
                    isExpanded = false
                }
            )

        }
    }
    return typeToReturn
}
