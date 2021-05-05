package com.example.aula09objheran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula09objheran.animal.*
import com.example.aula09objheran.cor.Amarelo
import com.example.aula09objheran.cor.Azul
import com.example.aula09objheran.cor.Cor
import com.example.aula09objheran.pessoa.Homem
import com.example.aula09objheran.pessoa.Mulher
import com.example.aula09objheran.pessoa.Pessoa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val corAmarelo = Amarelo(nome= "amarelo claro") // instanciar
        val corAzul = Azul(nome= "azul escuro") // instanciar

        pintar(corAmarelo)
        pintar(corAzul)

        val cachorro = Cachorro("Meu cachorro", raca="pug", tipoDoPelo = "liso") // intanciar
        val gato = Gato ("Meu gato")
        val cavalo = Cavalo ("Meu cavalo")
        val passarinho = Passarinho(nome = "Pardal" )


        levarAoPetshop(cachorro)
        levarAoPetshop(gato)
        levarAoPetshop(cavalo)

        val homen = Homem(cor = "Branco")
        val mulher = Mulher(cor="Branca")
        meDigaQualSexo(homen)
        meDigaQualSexo(mulher)
        meDigaSuaCor(homen)
        meDigaSuaCor(mulher)

    }

    fun pintar(cor: Cor){   //metodo recebe parametro cor
        println("Estou pintando um objeto com a cor: ${cor.nome}") //atributo
    }

    fun levarAoPetshop(animal: Animal){
        println("Levando o(a) ${animal.nome}")
    }

    fun meDigaQualSexo(pessoa: Pessoa){
        println("Levando o (a) ${pessoa.sexo}")
    }

    fun meDigaSuaCor(pessoa: Pessoa){
        println("A cor é ${pessoa.cor}")
    }


//    fun pintar(cor: Azul){
//        println("Estou pintando um objeto com a cor: ${cor.nome}")
//    }
//    fun pintar(cor: Amarelo){
//        println("Estou pintando um objeto com a cor: ${cor.nome}")
//    }
}