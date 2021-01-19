package com.githubuser.github.data.model

data class DetailUserResponse(
    val login: String,
    val id: Int,
    val avatar_url: String,
    val html_url: String,
    val followers_url: String,
    val followers: Int,
    val following_rl: String,
    val following: Int,
    val name: String
)
