package com.example.assignment8

data class Books(
    val title: String,
    val author: String,
    val imageResId: Int
) {
    fun getFormattedAuthor(): String {
        return "by $author"
    }
}
