package me.malkon.list

fun List<Livro?>.imprimeComMarcadores() {
    val joinToString = this
        .filterNotNull() //forma mais legível, faz a mesma coisa abaixo
        //.filter { it != null } //só filtra valores diferentes de nulos
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"//vai tentar chamar o titulo e autor, se for nulo, vai só mostrar o nulo ao inves de dar nullPointerException
        }
    println("#### Lista de livros #### \n$joinToString")
}