package me.malkon.list

//data class fornece algumas funções, métodos, extras: toString, equals, hashCode
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
)