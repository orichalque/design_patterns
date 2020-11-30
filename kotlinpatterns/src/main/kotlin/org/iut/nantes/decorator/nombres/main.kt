package org.iut.nantes.decorator.nombres

fun main() {
    val entier = Entier(50)
    Hexa(entier).base()
    Binary(Hexa(Octa(entier))).base()
}