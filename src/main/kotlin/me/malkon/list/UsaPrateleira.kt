package me.malkon.list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val organizarPorAutor = prateleira.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()

    //dessa maneira n vai funcionar, pois estamos lidando com a mesma lista de livros, e dessa forma
    //a lista de livros vai ficar de acordo com a ultima ordenação
}