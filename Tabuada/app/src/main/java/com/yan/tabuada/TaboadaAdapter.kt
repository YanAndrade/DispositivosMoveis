package com.yan.tabuada

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaboadaAdapter(var listaTaboada: MutableList<Taboada>): RecyclerView.Adapter<TaboadaAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nmDigitado: TextView = view.findViewById(R.id.nm_digitado);
        val nmIterado: TextView = view.findViewById(R.id.nm_iterado);
        val nmResult: TextView = view.findViewById(R.id.nm_result);
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaboadaAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_taboada, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaboadaAdapter.ItemViewHolder, position: Int) {
        holder.nmDigitado.text = listaTaboada[position].nm_digitado.toString()
        holder.nmIterado.text = listaTaboada[position].nm_iterado.toString()
        holder.nmResult.text = listaTaboada[position].nm_result.toString()
    }

    override fun getItemCount(): Int {
            return listaTaboada.size
    }

}
