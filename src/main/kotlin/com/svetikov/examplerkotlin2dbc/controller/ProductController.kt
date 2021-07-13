package com.svetikov.examplerkotlin2dbc.controller

import com.svetikov.examplerkotlin2dbc.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ProductController(private val repository: ProductRepository) {
    @GetMapping("/prod")
    fun getAll() =
            repository.findAll()
}