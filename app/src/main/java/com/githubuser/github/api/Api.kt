package com.githubuser.github.api

import com.githubuser.github.data.model.DetailUserResponse
import com.githubuser.github.data.model.User
import com.githubuser.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    //@Headers("Authorization: token d6be7ee17f3e9fee7dc1ec62d3586731316c2bf4")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    //@Headers("Authorization: token 46e23342542600bda4019c029036f24a54ad524d")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    //@Headers("Authorization: token 46e23342542600bda4019c029036f24a54ad524d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    //@Headers("Authorization: token 46e23342542600bda4019c029036f24a54ad524d")


    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>


}