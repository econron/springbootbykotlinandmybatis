package com.example.ddd

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional
import java.sql.DriverManager.println

@SpringBootApplication
class DddApplication

fun main(args: Array<String>) {
	runApplication<DddApplication>(*args)
}
