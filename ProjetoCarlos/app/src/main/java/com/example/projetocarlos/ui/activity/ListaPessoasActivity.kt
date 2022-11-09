package com.example.projetocarlos.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocarlos.R
import com.example.projetocarlos.dao.PessoasDao
import com.example.projetocarlos.database.dao.AppDatabase
import com.example.projetocarlos.model.Pessoas
import com.example.projetocarlos.ui.recyclerview.adapter.ListaPessoasAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaPessoasActivity : AppCompatActivity(R.layout.activity_lista_pessoas) {
    private val dao = PessoasDao()
    private val adapter = ListaPessoasAdapter(context = this, pessoas = dao.search())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        adapter.att(dao.search())
        configuraFab()
    }

    @SuppressLint("SuspiciousIndentation")
    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.pessoa_floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioPessoasActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configuraRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = PessoasDao()
        recyclerView.adapter = adapter
    }
}