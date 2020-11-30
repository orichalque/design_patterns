package org.iut.nantes.decorator.starbucks

fun main() {
    var b: Boisson = SupplementLait(SupplementChocolat(Americano()))
    println("${b.description()} coûte ${b.cout()} €")

    b = SupplementChocolat(SupplementChantilly(Moka()))
    println("${b.description()} coûte ${b.cout()} €")
}