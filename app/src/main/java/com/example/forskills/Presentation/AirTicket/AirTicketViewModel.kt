package com.example.forskills.Presentation.AirTicket

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.forskills.Data.Offers
import com.example.forskills.Data.OffersApi
import com.example.forskills.Data.RetrofitHelper
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AirTicketViewModel : ViewModel() {
    private val _offers = MutableStateFlow<ArrayList<Offers>>(ArrayList())
    val offers: StateFlow<ArrayList<Offers>> = _offers.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    fun getOffers() {
        val offersApi = RetrofitHelper.getInstance().create(OffersApi::class.java)
        viewModelScope.launch {
            _isLoading.value = true
            val result =
                offersApi.getOffers("https://drive.usercontent.google.com/u/0/uc?id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav&export=download")
            if (result.isSuccessful) {
                val offersList = ArrayList(result.body()?.offers!!)
                _offers.value = offersList
                //Log.d("Offers: ", offers.value.toString())
            } else {
                //Log.e("Error: ", result.errorBody().toString())
            }
            _isLoading.value = false
        }
    }
}