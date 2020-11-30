package org.iut.nantes.facade.cours

fun main(args: Array<String>) {
    val enseignant = Enseignant(Facade())
    enseignant.demarrerCours()
    enseignant.arreterCours()
}