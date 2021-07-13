package com.svetikov.examplerkotlin2dbc.repository

import com.svetikov.examplerkotlin2dbc.model.Product
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import java.util.*
@Repository
interface ProductRepository :R2dbcRepository<Product,UUID> {
}