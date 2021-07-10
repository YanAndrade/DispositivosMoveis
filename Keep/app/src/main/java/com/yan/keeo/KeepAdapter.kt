package com.yan.keeo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KeepAdapter(var listaConteudo: MutableList<Conteudo>): RecyclerView.Adapter<KeepAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val txtTitulo1: TextView = view.findViewById(R.id.titulo1)
        val txtTexto1: TextView = view.findViewById(R.id.texto1)
        val txtTitulo2: TextView = view.findViewById(R.id.titulo2)
        val txtTexto2: TextView = view.findViewById(R.id.texto2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeepAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_keep, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: KeepAdapter.ItemViewHolder, position: Int) {
        holder.txtTitulo1.text = listaConteudo[position].titulo1
        holder.txtTexto1.text = listaConteudo[position].texto1
        holder.txtTitulo2.text = listaConteudo[position].titulo2
        holder.txtTexto2.text = listaConteudo[position].texto2

    }

    override fun getItemCount(): Int {
        return listaConteudo.size
    }

}
