package com.example.ddd


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

    @Autowired
    lateinit var bookMapper: BookMapper

    @GetMapping("/books")
    fun index(): List<Book>  {
       return bookMapper.bookAll()
    }
}