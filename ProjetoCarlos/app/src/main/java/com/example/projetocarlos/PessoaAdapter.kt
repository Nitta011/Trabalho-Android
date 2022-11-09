package com.example.projetocarlos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocarlos.model.Pessoas

class PessoaAdapter(private val context: Context, private val pessoas:List <Pessoas>) : RecyclerView.Adapter <PessoaAdapter.PessoaViewHolder>() {
    class PessoaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.findViewById<TextView>(R.id.nome)
        fun bindView(pessoas: Pessoas){
            nome.text = pessoas.nome    
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PessoaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_itens,parent, false)
        return PessoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PessoaViewHolder, position: Int) {
        holder.bindView(pessoas[position])
    }

    override fun getItemCount(): Int {
        return pessoas.size
    }


}