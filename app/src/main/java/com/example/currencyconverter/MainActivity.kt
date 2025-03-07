package com.example.currencyconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
private lateinit var viewModel: CurrencyViewModel

override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)

    val repository = CurrencyRepository()
    viewModel = ViewModelProvider(this, CurrencyViewModelFactory(repository))[CurrencyViewModel::class.java]

    val editAmount = findViewById<EditText>(R.id.editAmount)
    val btnConvert = findViewById<Button>(R.id.btnConvert)
    val txtResult = findViewById<TextView>(R.id.txtResult)

    btnConvert.setOnClickListener{
val amount = editAmount.text.toString().toDouble()
        viewModel.convertCurrency(amount,"USD", "BRL")
    }

viewModel.exchangeRate.observe(this) {result ->
    txtResult.text = "Resultado: $result BRL"

}


}

}