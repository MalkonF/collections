package me.malkon.arrays

fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4) {
        idade3
    } else {
        idade4
    }

    println(maiorIdade)
    //com arrays fica mais organizado, mais fácil a manutenção e adição de novas idades
    // e com desempenho melhor que os if e else acima
    val idades = IntArray(4) //o tamanho do array n pode ser mudado em tempo de execução
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20

    var maiorIdade2 = 0

    for (idade in idades) {//para cada idade dentro do array de idades
        if (idade > maiorIdade2) {
            maiorIdade2 = idade
        }
    }
    println(maiorIdade2)
}