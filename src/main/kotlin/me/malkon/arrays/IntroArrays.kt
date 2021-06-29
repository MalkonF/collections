package me.malkon.arrays

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    val numPar = 0..100 step 2
    for (numeroPar in numPar) {
        println("$numeroPar ")
    }

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("${it} ") }

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Esta no intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfa = 'a'..'z'
    val letra = 'k'
    println(letra in alfa)
}


