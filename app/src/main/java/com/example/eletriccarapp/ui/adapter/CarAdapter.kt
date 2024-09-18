package com.example.eletriccarapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.domain.Carro

// Criando a classe adapter herdando da classe RecyclerView.Adapter
class CarAdapter(private val carros: List<Carro>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_carro, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = carros.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = carros[position].price
        holder.bateria.text = carros[position].bateria
        holder.potencia.text = carros[position].potencia
        holder.recarga.text = carros[position].recarga
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val preco : TextView
        val bateria : TextView
        val potencia : TextView
        val recarga : TextView
        init {
            view.apply {
            preco = findViewById(R.id.tv_preco_value)
            bateria = findViewById(R.id.tv_battery_value)
            potencia = findViewById(R.id.tv_potency_value)
            recarga = findViewById(R.id.tv_charging_value)
            }
        }
    }



}