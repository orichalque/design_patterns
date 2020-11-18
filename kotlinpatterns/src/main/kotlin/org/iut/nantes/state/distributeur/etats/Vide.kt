package org.iut.nantes.state.distributeur.etats

import org.iut.nantes.state.distributeur.Distributeur

class Vide(distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("Vide.")
    }
}