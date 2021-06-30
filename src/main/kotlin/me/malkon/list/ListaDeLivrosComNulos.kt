package me.malkon.list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } //vai agrupar livros pela editora. O elvis operator vai jogar esse valor qnd for nulo
        .forEach { (editora, livros) ->//p cada elementos vai ter uma chave que é a editora e um valor que é o livr
            println("$editora: ${livros.joinToString { it.titulo }}")//imprime a editora e o titulo livro
        }
}