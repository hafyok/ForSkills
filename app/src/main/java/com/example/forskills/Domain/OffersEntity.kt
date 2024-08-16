package com.example.forskills.Domain

data class OffersEntity(
    var id: Int? = null,
    var title: String? = null,
    var town: String? = null,
    var price: PriceEntity? = PriceEntity()
)
