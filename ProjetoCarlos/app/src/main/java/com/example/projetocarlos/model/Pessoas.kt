package com.example.projetocarlos.model


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
class Pessoas (
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val nome: String,
    val dt_nascimento :String,
    val telefone: String,
    val email: String,
    val rua: String,
    val cep: String
    ) : Parcelable

