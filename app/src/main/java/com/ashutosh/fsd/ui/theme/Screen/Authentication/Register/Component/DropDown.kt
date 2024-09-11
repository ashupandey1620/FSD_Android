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
import androidx.compose.material3.MaterialTheme
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
fun dropdownMenu(value: String):String {

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
        val containerColor = MaterialTheme.colorScheme.secondary
        OutlinedTextField(
            value = type ,
            onValueChange = {},
            readOnly = true,

            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = { Text(text = "College", color = Color(0xFFA7A7A7),
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
                    Text(text = "Student")
                },
                onClick = {
                    type = "Student Account"
                    typeToReturn = "Student"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Employee")
                },
                onClick = {
                    type = "Employee Account"
                    typeToReturn = "Employee"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Company")
                },
                onClick = {
                    type = "Company Account"
                    typeToReturn = "Company"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Others")
                },
                onClick = {
                    type = "Others"
                    typeToReturn = "Others"
                    isExpanded = false
                }
            )

        }
    }
    return typeToReturn
}
