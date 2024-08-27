package com.ashutosh.fsd.NetworkModule.Model.AddUpdate

data class AddUpdateRequest(
    val update: String,
    val update_for_role: String,
    val update_title: String
)