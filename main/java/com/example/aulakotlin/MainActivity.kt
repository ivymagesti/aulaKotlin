package com.example.aulakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeiroNumero = findViewById(R.id.editTextTextPersonName) as EditText
        val segundoNumero = findViewById(R.id.editTextTextPersonName2) as EditText
        val total = findViewById(R.id.editTextTextPersonName3) as EditText
        val btnSoma = findViewById(R.id.button) as Button
        val btnSubtracao = findViewById(R.id.button2) as Button
        val btnDivisao = findViewById(R.id.button3) as Button
        val btnMultiplicacao = findViewById(R.id.button4) as Button

        btnSoma.setOnClickListener{
            val primeiroNumero = primeiroNumero.text.toString().toFloat()
            val segundoNumero = segundoNumero.text.toString().toFloat()

            val resultado = primeiroNumero + segundoNumero

            total.setText(resultado.toString())
        }

        btnSubtracao.setOnClickListener{
            val primeiroNumero = primeiroNumero.text.toString().toFloat()
            val segundoNumero = segundoNumero.text.toString().toFloat()

            val resultado = primeiroNumero - segundoNumero

            total.setText(resultado.toString())
        }

        btnDivisao.setOnClickListener{
            val primeiroNumero = primeiroNumero.text.toString().toFloat()
            val segundoNumero = segundoNumero.text.toString().toFloat()

            val resultado = primeiroNumero / segundoNumero

            total.setText(resultado.toString())
        }

        btnMultiplicacao.setOnClickListener{
            val primeiroNumero = primeiroNumero.text.toString().toFloat()
            val segundoNumero = segundoNumero.text.toString().toFloat()

            val resultado = primeiroNumero * segundoNumero

            total.setText(resultado.toString())
        }

    }
}