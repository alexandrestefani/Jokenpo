package com.alexandrestefani.jokenpo

import kotlin.random.Random

enum class Result{
    VITORIA, DERROTA, EMPATE
}

// por mais que o mercado queira em ingles faço questão de incluir os nomes em portugues para fazer mais sentido lógico para mim nesse momento de aprendizado.
class GameEngine (val jogadaAdversarioEletronico: Array<String>){
    fun gerarJogadaAdversarioEletronico(): String {
        val numeroAleatorio = Random.nextInt(0,2)
        return jogadaAdversarioEletronico[numeroAleatorio]
    }

    fun calcularQuemGanhou(jogadaUsuario:String): Result {
        val jogadaEletronica = gerarJogadaAdversarioEletronico()

                return when{
            jogadaUsuario == jogadaEletronica -> Result.EMPATE
            jogadaUsuario == "pedra" && jogadaEletronica =="tesoura" -> Result.VITORIA
            jogadaUsuario == "pedra" && jogadaEletronica =="papel" -> Result.DERROTA
            jogadaUsuario == "tesoura" && jogadaEletronica =="papel" -> Result.VITORIA
            jogadaUsuario == "tesoura" && jogadaEletronica =="pedra" -> Result.DERROTA
            jogadaUsuario == "papel" && jogadaEletronica =="pedra" -> Result.VITORIA
            else -> Result.DERROTA
        }
    }


}