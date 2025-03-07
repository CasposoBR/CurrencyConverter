package com.example.currencyconverter
//
class CurrencyRepository {
    suspend fun getRates(base: String): ExchangeRatesResponse? {
        return RetrofitInstance.api.getExchangeRates(base).body()
    }
}
