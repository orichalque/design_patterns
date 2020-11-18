package org.iut.nantes.facade.cours

class Enseignant(private val facade: Facade) {
    fun demarrerCours() {
        facade.demarrerCours()
    }

    fun arreterCours() {
        facade.arreterCours()
    }
}