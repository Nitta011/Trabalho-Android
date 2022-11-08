package com.example.projetocarlos.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocarlos.R
import com.example.projetocarlos.model.Pessoas
import com.example.projetocarlos.ui.recyclerview.adapter.ListaPessoasAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaPessoasAdapter(
            context = this, pessoas = listOf(
                Pessoas(
                    nome = "Gabriel",
                    dt_nascimento = "11/03/2002",
                    telefone = "(44) 99832342",
                    email = "gabriel.nitta@edu.unipar.br",
                    rua = "Av. Getulio Vargas",
                    cep = "98762-201"
                ),
                Pessoas(
                    nome = "Gustavo",
                    dt_nascimento = "14/05/2001",
                    telefone = "(44) 99833242",
                    email = "gufrancozo@edu.unipar.br",
                    rua = "Av. Angelo Moreira da Fonseca",
                    cep = "98701-201"
                ),
            ))
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            Intent(this, FormularioPessoasActivity::class.java)
            startActivity(intent)
        }
    }
}