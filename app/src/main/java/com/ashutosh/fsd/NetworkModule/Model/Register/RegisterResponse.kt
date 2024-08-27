package com.ashutosh.fsd.NetworkModule.Model.Register

data class RegisterResponse(
    val `data`: Data,
    val status: Int,
    val email: List<String>
)

data class Data(
    val access_token: String,
    val refresh_token: String,
    val user_id: String
)