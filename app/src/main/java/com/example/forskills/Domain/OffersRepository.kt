package com.example.forskills.Domain

interface OffersRepository {
    suspend fun getOffersList(): List<MainOffersEntity>
}