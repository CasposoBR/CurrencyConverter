package com.example.currencyconverter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CurrencyViewModel(private val repository: CurrencyRepository): ViewModel() {
    private val _exchangeRate = MutableLiveData<Double>()
    val exchangeRate: LiveData<Double> get () = _exchangeRate

    fun convertCurrency(amount: Double, from: String, to: String ){
        viewModelScope.launch {
            val rates = repository.get.Rates(from)
            val rate = rates?.rates?.get(to)? : 0.0
            _exchangeRate.postValue(amount * rate)

        }

    }

}
