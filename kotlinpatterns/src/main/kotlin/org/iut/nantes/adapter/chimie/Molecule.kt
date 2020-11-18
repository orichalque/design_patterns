package org.iut.nantes.adapter.chimie

internal class Molecule(val name: String, private val formula_: String) {
    fun affiche() {
        println("""
    Nom : ${name}
    Formule : $formula_
    """.trimIndent())
    }
}