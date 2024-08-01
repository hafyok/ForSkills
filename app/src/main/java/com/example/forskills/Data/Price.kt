package com.example.forskills.Data

import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("value") var value: Int? = null
)