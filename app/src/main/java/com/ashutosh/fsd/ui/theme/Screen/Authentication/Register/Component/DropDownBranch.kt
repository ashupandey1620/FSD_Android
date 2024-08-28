package com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.Component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dropdownMenuBranch():String {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    var branch by remember {
        mutableStateOf("")
    }


    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { newValue ->
            isExpanded = newValue
        },
        modifier = Modifier.padding(top = 10.dp)
            .fillMaxWidth()

    ) {
        val containerColor = Color(0xFF222222)
        OutlinedTextField(
            value = branch,
            onValueChange = {},
            readOnly = true,

            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = { Text(text = "Branch", color = Color(0xFFA7A7A7),fontSize = 14.sp) },

            colors = ExposedDropdownMenuDefaults.textFieldColors(
                focusedTextColor = Color.White ,
                unfocusedTextColor = Color.White,
                focusedContainerColor = containerColor ,
                unfocusedContainerColor = containerColor ,
                disabledContainerColor = containerColor ,
            ),
            modifier = Modifier.fillMaxWidth().menuAnchor(),
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
                    Text(text = "CSE")
                },
                onClick = {
                    branch = "CSE"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "CS-AI")
                },
                onClick = {
                    branch = "CS-AI"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "CS-AIML")
                },
                onClick = {
                    branch = "CS-AIML"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "CS-IOT")
                },
                onClick = {
                    branch = "CS-IOT"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "CS-DS")
                },
                onClick = {
                    branch = "CS-DS"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "CS-CYS")
                },
                onClick = {
                    branch = "CS-CYS"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "AIDS")
                },
                onClick = {
                    branch = "AIDS"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "AIML")
                },
                onClick = {
                    branch = "AIML"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "IT")
                },
                onClick = {
                    branch = "IT"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "EC")
                },
                onClick = {
                    branch  = "EC"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "M.Tech")
                },
                onClick = {
                    branch = "M.Tech"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "B.Pharma")
                },
                onClick = {
                    branch = "B.Pharma"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "D.Pharma")
                },
                onClick = {
                    branch = "D.Pharma"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "M.Pharma")
                },
                onClick = {
                    branch = "M.Pharma"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "MCA")
                },
                onClick = {
                    branch = "MCA"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "BCA")
                },
                onClick = {
                    branch = "BCA"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "MBA")
                },
                onClick = {
                    branch = "MBA"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "BBA")
                },
                onClick = {
                    branch = "BBA"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Others")
                },
                onClick = {
                    branch = "Others"
                    isExpanded = false
                }
            )

        }
    }
    return branch
}

