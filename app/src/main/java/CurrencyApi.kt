import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
@GET("latest")
suspend fun getExchangeRates(@Query("base")base:String ): Response<ExchangeRatesResponse>


}




//Essa interface define o endpoint da API para buscar as taxas de câmbio.