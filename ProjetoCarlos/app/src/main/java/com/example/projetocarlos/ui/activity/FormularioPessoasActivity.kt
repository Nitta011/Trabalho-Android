package com.example.projetocarlos.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.projetocarlos.R
import com.example.projetocarlos.model.Pessoas

class FormularioPessoasActivity : AppCompatActivity(R.layout.activity_formulario_pessoas) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val campoNome = findViewById<EditText>(R.id.nome)
                val nome = campoNome.text.toString()
                Log.i("FormularioPessoas", "onCreate: $nome")

                val campoDtNascimento = findViewById<EditText>(R.id.dt_nascimento)
                val dtNascimento = campoDtNascimento.text.toString()
                val campoTelefone = findViewById<EditText>(R.id.telefone)
                val telefone = campoTelefone.text.toString()
                val campoEmail = findViewById<EditText>(R.id.email)
                val email = campoTelefone.text.toString()
                val campoRua = findViewById<EditText>(R.id.rua)
                val rua = campoTelefone.text.toString()
                val campoCep = findViewById<EditText>(R.id.cep)
                val cep = campoTelefone.text.toString()
                val pessoaNova = Pessoas(
                    nome = nome,
                    dt_nascimento = dtNascimento,
                    telefone = telefone,
                    email = email,
                    rua = rua,
                    cep = cep
                )
                Log.i("FormularioPessoas", "onCreate: $pessoaNova")
            }
        })
    }
}