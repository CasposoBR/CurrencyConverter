package com.example.currencyconverter
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CurrencyViewModelFactory(private val repository: CurrencyRepository) : ViewModelProvider.Factory {
override fun <T: ViewModel> create(modelClass:Class<T>): T {
    if (modelClass.isAssignableFrom((CurrencyViewModel::class.java))) {
        return CurrencyViewModel(repository) as T
        }
throw IllegalArgumentException("Unknown ViewModel class")

}

}
