package me.malkon.arrays

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.00)

    val aumento = 1.1
    var indice = 0

    for (salario in salarios) {//salario é uma var imutável entao não podemos modificar o valor dela
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())

    for (indice in salarios.indices) {//itera com cada indice do array(que é incrementado automaticamente)
        // ao invés dos elementos do array
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario -> //i é o índice
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())

}