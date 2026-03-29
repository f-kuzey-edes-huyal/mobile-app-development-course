package com.example.simplenavigation

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data class ColorRoute(
    val name: String,
    val value: Long
)