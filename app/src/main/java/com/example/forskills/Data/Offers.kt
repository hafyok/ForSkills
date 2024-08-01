package com.example.forskills.Data

import com.google.gson.annotations.SerializedName

data class Offers(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("town") var town: String? = null,
    @SerializedName("price") var price: Price? = Price()
)