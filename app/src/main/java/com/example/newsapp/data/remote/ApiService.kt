package com.example.newsapp.data.remote

import com.example.newsapp.data.remote.dto.news.NewsDto
import retrofit2.http.GET

interface ApiService {

    @GET("/v2/everything")
    suspend fun getNews(): List<NewsDto>

    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(): List<NewsDto>

}