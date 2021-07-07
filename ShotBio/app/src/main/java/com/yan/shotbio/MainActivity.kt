package com.yan.shotbio

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foto = findViewById<ImageView>(R.id.foto)
        val selecionar = findViewById<Button>(R.id.selecionar)
        val sobre = findViewById<TextView>(R.id.sobre)
        val formacao = findViewById<TextView>(R.id.formacao)
        val experiencia = findViewById<TextView>(R.id.experiencia)
        val objetivo = findViewById<TextView>(R.id.objetivo)

        selecionar.setOnClickListener(View.OnClickListener {
            val cw = ContextWrapper(applicationContext)
            val directory: File = cw.getDir("imageDir", Context.MODE_PRIVATE)
            val file = File(directory, "fotoperfil" + ".png")
            foto.setImageDrawable(Drawable.createFromPath(file.toString()))
        })

        sobre.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        sobre.setOnClickListener {
            val intent = Intent(this@MainActivity, SobreActivity::class.java)
            startActivity(intent)

        }

        formacao.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        formacao.setOnClickListener {
            val intent = Intent(this@MainActivity, FormacaoActivity::class.java)
            startActivity(intent)

        }

        experiencia.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        experiencia.setOnClickListener {
            val intent = Intent(this@MainActivity, ExperienciaActivity::class.java)
            startActivity(intent)
        }

        objetivo.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        objetivo.setOnClickListener {
            val intent = Intent(this@MainActivity, ObjetivoActivity::class.java)
            startActivity(intent)
        }
    }
}