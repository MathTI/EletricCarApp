package com.example.eletriccarapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalcularAutonomiaActivity : AppCompatActivity() {
    private lateinit var preco: EditText
    private lateinit var kmPercorrido: EditText
    private lateinit var btnCalcular: Button
    private lateinit var tv_resultado: TextView
    private lateinit var btnClose: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners()
    }

    private fun setupView() {
        preco = findViewById(R.id.et_preco)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        tv_resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btnCalcular)
        btnClose = findViewById(R.id.ib_close)
    }

    private fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
        btnClose.setOnClickListener {
            //função finish() é utilizada para finalizar a atividade (activity) atual, ou seja, ela é removida da pilha de atividades e é encerrada.
            finish()
        }
    }

    private fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km

        tv_resultado.text = result.toString()

    }



}