package com.example.ddd

import org.apache.ibatis.annotations.Mapper

@Mapper
interface BookMapper {

    fun bookAll(): List<Book>
}