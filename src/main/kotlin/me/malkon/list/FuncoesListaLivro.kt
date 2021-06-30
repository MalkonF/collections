package me.malkon.list

fun List<Livro?>.imprimeComMarcadores() {
    val joinToString = this.joinToString(separator = "\n") {
        " - ${it?.titulo} de ${it?.autor}"//vai tentar chamar o titulo e autor, se for nulo, vai só mostrar o nulo ao inves de dar nullPointerException
    }
    println("#### Lista de livros #### \n$joinToString")
}