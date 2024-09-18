package com.example.eletriccarapp.data

import com.example.eletriccarapp.domain.Carro

class CarFactory {
    val list = listOf<Carro>(
        Carro(
            id = 1,
            price = "R$ 300.000",
            bateria = "300 kWh",
            potencia = "300 CV",
            recarga =  "23 minutos",
            urlPhoto = "www.google.com.br"
        )
    )

}