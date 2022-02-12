package com.ajc.tasty.model.remote.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//https://newsapi.org/v2/everything?q=india?apiKey=b5becfb5a3d34c7991cb1af2c22c0d57

//https://tasty.p.rapidapi.com/recipes/list?from=0&size=20

interface ApiService {
    @GET("recipes/list")
    suspend fun getData(
        @Query("from") from: String,
        @Query("size") size: String,
        @Header("x-rapidapi-host") token: String,
        @Header("x-rapidapi-key") token1: String

    ): Response<com.ajc.tasty.model.remote.ResponseDTO>
}