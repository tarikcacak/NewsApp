package com.example.newsapp.domain.repository

import com.example.newsapp.data.remote.dto.news.NewsDto

interface NewsRepository {

    suspend fun getNews(): List<NewsDto>

    suspend fun getTopHeadlines(): List<NewsDto>
}