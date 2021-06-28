package com.yan.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.btn_calcular)
        val valor = findViewById<EditText>(R.id.etn_numero)

        calcular.setOnClickListener{
            val rv = findViewById<RecyclerView>(R.id.rv_taboada)
            val lista = mutableListOf<Taboada>()
            val numero = Integer.parseInt(valor.text.toString())

            for (i in 1..10) {
                lista.add(Taboada(numero,i,i*numero))
            }

            rv.adapter = TaboadaAdapter(lista)
            rv.layoutManager = LinearLayoutManager(this)
        }

    }

}