package org.iut.nantes.state.distributeur.etats

import org.iut.nantes.state.distributeur.Distributeur

class BonbonVendu(distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("En cours de distribution.")
    }
}