package com.example.fakestore.util

import retrofit2.Response
import retrofit2.http.GET

interface ProductService {

    @GET("/products")
    suspend fun getProducts () :Response<Any>
}