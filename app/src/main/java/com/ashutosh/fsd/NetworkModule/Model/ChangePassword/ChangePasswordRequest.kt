package com.ashutosh.fsd.NetworkModule.Model.ChangePassword

data class ChangePasswordRequest(
    val current_password: String,
    val new_password: String
)