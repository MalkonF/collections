package me.malkon.arrays

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val media: Double = idades.average()
    println(media)

    var todosMaiores = idades.all { it > 18 } //retorna true se todos os elementos do array condizeram com a condição
    println("Todos maiores? ${todosMaiores}")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno maior de idade? ${existeMaior}")

    val maiores = idades.filter { it >= 18 } //retorna uma lista com todos valores maior de 18
    println(maiores)

    val busca = idades.find { it == 18 } //se tiver 2 valores iguais 18 ele retorna o primeiro
    println(busca)

}


