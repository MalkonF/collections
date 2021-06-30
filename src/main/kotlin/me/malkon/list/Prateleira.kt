package me.malkon.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>

) {
    fun organizarPorAutor(): List<Livro> {
        // livros.sortBy { it.autor }//sortBy nao pode ser usado com List pq ela é imutável e n pode ser alterada
        return livros.sortedBy { it.autor }

    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}