package com.example.forskills.Data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface OffersApi {
    @GET
    suspend fun getOffers(@Url url: String) : Response<MainOffers>
}