package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.ApiService
import com.example.newsapp.data.remote.dto.news.NewsDto
import com.example.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val api: ApiService
) : NewsRepository {

    override suspend fun getNews(): List<NewsDto> {
        return api.getNews()
    }

    override suspend fun getTopHeadlines(): List<NewsDto> {
        return api.getTopHeadlines()
    }
}