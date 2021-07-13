package com.svetikov.examplerkotlin2dbc.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("product")
data class Product(
        @Id
        val id:UUID,
        val name:String,
        val zip_code:String,
        val price:Int

)
