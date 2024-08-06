package com.example.forskills.Data

import com.google.gson.annotations.SerializedName

data class MainOffers(
    @SerializedName("offers") var offers: ArrayList<Offers> = arrayListOf()
)