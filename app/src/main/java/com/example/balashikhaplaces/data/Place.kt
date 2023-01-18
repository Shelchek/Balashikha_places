package com.example.balashikhaplaces.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place (
    @StringRes val name: Int,
    @StringRes val address: Int,
    @StringRes val description: Int,
    @DrawableRes val picture: Int,
    //indexes 0-1 -> Monday - Sunday
    val schedule: List<String>
)