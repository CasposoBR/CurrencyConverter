package com.example.currencyconverter

import ExchangeRatesResponse

//
class CurrencyRepository {
    suspend fun getRates(base: String): ExchangeRatesResponse? {
        return RetrofitInstance.api.getExchangeRates(base).body()
    }
}
