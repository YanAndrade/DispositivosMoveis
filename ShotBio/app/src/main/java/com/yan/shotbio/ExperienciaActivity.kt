package com.yan.shotbio

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExperienciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.experiencia)

        val experienciatexto = findViewById<TextView>(R.id.experienciatexto)

        experienciatexto.text = "O que é o Lorem Ipsum?\n" +
                "O Lorem Ipsum é um texto modelo da indústria tipográfica e de impressão. " +
                "O Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde " +
                "o ano de 1500, quando uma misturou os caracteres de um texto para criar um espécime " +
                "e livro. Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia" +
                " electrónica, mantendo-se essencialmente inalterada. Foi popularizada nos anos 60 com " +
                "a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum, e " +
                "mais recentemente com os programas de publicação como o Aldus PageMaker que incluem " +
                "versões do Lorem Ipsum."
    }
}
