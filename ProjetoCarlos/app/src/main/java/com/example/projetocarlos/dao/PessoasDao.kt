package com.example.projetocarlos.dao

import com.example.projetocarlos.model.Pessoas

class PessoasDao {


    fun add(pessoa: Pessoas){
        Companion.pessoas.add(pessoa)
    }

    fun search() : List<Pessoas>{
    return Companion.pessoas.toList()
    }

        companion object{
        private val pessoas = mutableListOf<Pessoas>()

        }
}