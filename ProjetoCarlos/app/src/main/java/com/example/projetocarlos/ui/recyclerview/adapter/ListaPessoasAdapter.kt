package com.example.projetocarlos.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocarlos.R
import com.example.projetocarlos.model.Pessoas

class ListaPessoasAdapter(
    private val context: Context,
    private val pessoas : List<Pessoas>
) : RecyclerView.Adapter<ListaPessoasAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(pessoa: Pessoas) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = pessoa.nome
            val dt_nascimento = itemView.findViewById<TextView>(R.id.dt_nascimento)
            dt_nascimento.text = pessoa.dt_nascimento
            val telefone = itemView.findViewById<TextView>(R.id.telefone)
            telefone.text = pessoa.telefone
            val email = itemView.findViewById<TextView>(R.id.email)
            email.text = pessoa.email
            val rua = itemView.findViewById<TextView>(R.id.rua)
            rua.text = pessoa.rua
            val cep = itemView.findViewById<TextView>(R.id.cep)
            cep.text = pessoa.cep
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.lista_pessoas, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pessoa = pessoas[position]
    holder.vincula(pessoa)
    }

    override fun getItemCount(): Int = pessoas.size

}
