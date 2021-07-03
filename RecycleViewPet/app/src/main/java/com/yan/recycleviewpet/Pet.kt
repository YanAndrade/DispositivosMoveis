package com.yan.recycleviewpet

import android.graphics.drawable.Drawable

data class Pet (
    var foto: Drawable?=null,
    var nome: String,
    var raça: Raça,
    var sexo: Sexo,

    )