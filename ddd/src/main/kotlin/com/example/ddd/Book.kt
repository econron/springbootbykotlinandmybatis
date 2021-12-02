package com.example.ddd

import java.sql.Date

data class Book (
    var id: Int,
    var book_name: String,
    var volume_num: Int,
    var author_name: String,
    var published_date: Date
)