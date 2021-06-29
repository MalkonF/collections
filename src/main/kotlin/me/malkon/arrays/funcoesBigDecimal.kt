package me.malkon.arrays

import java.math.BigDecimal

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

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) { //this referencia o Array
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}