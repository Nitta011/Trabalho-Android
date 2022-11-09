package com.example.projetocarlos.database.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.projetocarlos.model.Pessoas

@Database(entities = [Pessoas::class], version = 1 )
abstract class AppDatabase : RoomDatabase() {

    abstract fun pessoasDao():  PessoaDao

}