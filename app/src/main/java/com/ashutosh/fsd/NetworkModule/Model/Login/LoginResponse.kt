package com.ashutosh.fsd.NetworkModule.Model.Login

data class LoginResponse(
    val `data`: Data,
    val message: String,
    val status: Int,
    val description: String,
)