package com.ashutosh.fsd.NetworkModule.Model.ViewUpdate

data class ViewUpdateResponse(
    val `data`: List<Data>,
    val message: String,
    val status: Int
)

data class Data(
    val timestamp: String,
    val update: String,
    val update_for_role: String,
    val update_title: String
)