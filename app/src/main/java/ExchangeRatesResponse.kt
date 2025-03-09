data class ExchangeRatesResponse (
    val base:String,
    val rates:Map<String, Double>
)

//Essa classe representa a resposta da API, facilitando o parsing do JSON.