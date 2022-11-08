package com.example.projetocarlos.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocarlos.R
import com.example.projetocarlos.model.Pessoas
import com.example.projetocarlos.ui.recyclerview.adapter.ListaPessoasAdapter

class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 //       val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Lista de Pessoas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Nome Completo"
//        val valor = findViewById<TextView>(R.id.valor)
 //       valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaPessoasAdapter(context = this, pessoas = listOf(
            Pessoas(nome = "Gabriel", dt_nascimento = "11/03/2002", telefone = "(44) 99832342",
                email = "gabriel.nitta@edu.unipar.br", rua = "Av. Getulio Vargas", cep = "98762-201" ),
        Pessoas(nome = "Gustavo", dt_nascimento = "14/05/2001", telefone = "(44) 99833242",
            email = "gufrancozo@edu.unipar.br", rua = "Av. Angelo Moreira da Fonseca", cep = "98701-201" )
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}