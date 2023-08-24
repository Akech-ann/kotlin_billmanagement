package com.akech.assessement.api

import com.akech.assessement.model.Post
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}



