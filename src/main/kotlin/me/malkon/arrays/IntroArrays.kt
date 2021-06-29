package me.malkon.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios2 = bigDecimalArrayOf("1500.55", "2000.00", "5000.0", "10000.0")
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO } // array com 5 elementos BigDecimal todos incializados com 0
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2004.00".toBigDecimal()
    println(salarios.contentToString())
    println(salarios2.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    //como se fosse reduce() mas aceita um valor inicial para adicionar ao total
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

//converte valores de String para um array de big decimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> { //pode passar qualquer qnt de valores para função. Vão estar num array de strings
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//Extention function. Vamos poder chamar ela junto com salariosComAumento que é um array big decimal
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor -> //valor é cada casa do Array BigDecimal e acumulador acumula todos estes valores
        acumulador + valor
    }
}
