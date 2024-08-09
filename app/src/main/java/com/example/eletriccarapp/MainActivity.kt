package com.example.eletriccarapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var preco: EditText
    private lateinit var kmPercorrido: EditText
    private lateinit var btnCalcular: Button
    private lateinit var tv_resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupView()
        setupListeners()

    }

    private fun setupView() {
        preco = findViewById(R.id.et_preco)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        btnCalcular = findViewById(R.id.bCalcular)
        tv_resultado = findViewById(R.id.tv_resultado)

    }

    private fun setupListeners() {
        btnCalcular.setOnClickListener{
            // Como queremos passar o valor digitado pelo usuário precisamos converter
            // para string e para calcular precisamos converter para float
            val preco = preco.text.toString().toFloat()
            val km = kmPercorrido.text.toString().toFloat()
            val resultado = preco / km
            tv_resultado.text = resultado.toString()

        }

    }


}