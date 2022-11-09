package com.example.projetocarlos.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.projetocarlos.model.Pessoas

@Dao
interface PessoaDao {

    @Query("Select * From Pessoas")
    fun buscaTodos():List<Pessoas>

    @Insert
    fun salva(vararg pessoas:Pessoas)
}