package com.codeenemy.weathercast.models

import java.io.Serializable
data class Sys(
    val type: Int,
    val id: Int,
    val country: String,
    val sunrise: Long,
    val sunset: Long
) : Serializable
