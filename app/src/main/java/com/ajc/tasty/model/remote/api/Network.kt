package com.ajc.tasty.model.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//https://newsapi.org/v2/everything?q=india?apiKey=b5becfb5a3d34c7991cb1af2c22c0d57

//https://tasty.p.rapidapi.com/recipes/list?from=0&size=20
class Network {
    companion object {
        private const val BaseUrl = "https://tasty.p.rapidapi.com/"
        fun getInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}