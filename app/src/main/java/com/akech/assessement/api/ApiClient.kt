package com.akech.assessement.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: JsonPlaceholderApiService by lazy {
        retrofit.create(JsonPlaceholderApiService::class.java)
    }
}


