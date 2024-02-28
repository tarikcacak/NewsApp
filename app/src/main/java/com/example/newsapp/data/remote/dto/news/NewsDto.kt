package com.example.newsapp.data.remote.dto.news


import com.example.newsapp.domain.model.news.Article
import com.example.newsapp.domain.model.news.News
import com.google.gson.annotations.SerializedName

data class NewsDto(
    @SerializedName("articles")
    val articles: List<ArticleDto>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)

fun List<ArticleDto>.toArticles(): List<Article> {
    return map { it.toArticle() }
}

fun NewsDto.toNews(): News {
    return News(
        articles = articles.toArticles()
    )
}