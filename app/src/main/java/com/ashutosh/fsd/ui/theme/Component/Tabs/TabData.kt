package com.ashutosh.growappassignment.ui.theme.Component.Tabs

data class TabData (
    val title : String
)

val tabs = listOf(
    TabData(Tabs.MyDrive.value) ,
    TabData(Tabs.Mobile.value)
)

enum class Tabs (val value:String){
    MyDrive("My Drive"),
    Mobile("Mobile")
}