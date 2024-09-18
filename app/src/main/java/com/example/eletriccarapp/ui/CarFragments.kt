package com.example.eletriccarapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.data.CarFactory
import com.example.eletriccarapp.ui.adapter.CarAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton


class CarFragments : Fragment() {
    private lateinit var fabCalcular: FloatingActionButton
    private lateinit var lista: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_car_fragments, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
        setupListeners()

    }

    fun setupView(view: View) {
        view.apply {
            fabCalcular = findViewById(R.id.fab_button)
            lista = findViewById(R.id.rv_view)
        }
    }

    private fun setupList() {
        val dados = CarFactory().list
        val adapter = CarAdapter(dados)
        lista.adapter = adapter

    }
    private fun setupListeners() {
        fabCalcular.setOnClickListener{
            // Metodo que recebe como parametro a origem e intenção de chegada
           startActivity(Intent(context, CalcularAutonomiaActivity::class.java))
        }
    }
}