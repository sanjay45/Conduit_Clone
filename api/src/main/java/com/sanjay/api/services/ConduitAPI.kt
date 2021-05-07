package com.sanjay.api.services

import com.sanjay.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET


interface ConduitAPI {

    @GET("articles")
    fun getArticles(): Call<ArticlesResponse>
}