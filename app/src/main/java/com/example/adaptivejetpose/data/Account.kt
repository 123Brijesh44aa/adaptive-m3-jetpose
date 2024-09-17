package com.example.adaptivejetpose.data

import androidx.annotation.DrawableRes

data class Account(
    val id: Long,
    val uid: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val altEmail: String,
    val avatar: String,
    var isCurrentAccount: Boolean = false
){
    val fullName: String = "$firstName $lastName"
}