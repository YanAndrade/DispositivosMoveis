package com.yan.gasolinaxalcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.btn_calcular)
        val gasolina = findViewById<EditText>(R.id.etn_gasolina)
        val alcool = findViewById<EditText>(R.id.etn_alcool)
        val resul = findViewById<TextView>(R.id.txt_result)

        calcular.setOnClickListener{
            val vl_gasolina = (gasolina.text.toString().toDouble())
            val vl_alcool = (alcool.text.toString().toDouble())


            if ((vl_gasolina / vl_alcool) > 0.7){
                resul.text = "Compensa mais a gasolina"
            } else {
                resul.text = "Compensa mais o alcool"
            }
        }
    }
}