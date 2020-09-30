package fr.tblf.patterns.decorator.nombres

fun main() {
    val entier = Entier(50)
    Hexa(entier).base()
    Binary(Hexa(Octa(entier))).base()
}