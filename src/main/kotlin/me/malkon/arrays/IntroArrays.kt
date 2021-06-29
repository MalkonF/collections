package me.malkon.arrays

fun main() {
    //essa função tem o código mais conciso que array tradicional
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade2 = 0

    for (idade in idades) {//para cada idade dentro do array de idades
        if (idade > maiorIdade2) {
            maiorIdade2 = idade
        }
    }
    println(maiorIdade2)

    var menorIdade = Int.MAX_VALUE
    //função forEach código fica mais organizado e fácil de manter. Desempenho maior?
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}