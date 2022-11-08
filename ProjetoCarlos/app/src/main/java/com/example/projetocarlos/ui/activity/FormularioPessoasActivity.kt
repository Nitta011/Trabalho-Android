package com.example.projetocarlos.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.projetocarlos.R
import com.example.projetocarlos.dao.PessoasDao
import com.example.projetocarlos.model.Pessoas

class FormularioPessoasActivity : AppCompatActivity(R.layout.activity_formulario_pessoas) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener{
                val pessoaNova = CriaPessoa()
                val dao = PessoasDao()
                dao.add(pessoaNova)
                finish()
            }
        }

    private fun CriaPessoa(): Pessoas {
        val campoNome = findViewById<EditText>(R.id.pessoa_nome)
        val nome = campoNome.text.toString()
        val campoDtNascimento = findViewById<EditText>(R.id.pessoa_dt_nascimento)
        val dtNascimento = campoDtNascimento.text.toString()
        val campoTelefone = findViewById<EditText>(R.id.pessoa_telefone)
        val telefone = campoTelefone.text.toString()
        val campoEmail = findViewById<EditText>(R.id.pessoa_email)
        val email = campoEmail.text.toString()
        val campoRua = findViewById<EditText>(R.id.pessoa_rua)
        val rua = campoRua.text.toString()
        val campoCep = findViewById<EditText>(R.id.pessoa_cep)
        val cep = campoCep.text.toString()

        return Pessoas(
            nome = nome,
            dt_nascimento = dtNascimento,
            telefone = telefone,
            email = email,
            rua = rua,
            cep = cep
        )
    }
}