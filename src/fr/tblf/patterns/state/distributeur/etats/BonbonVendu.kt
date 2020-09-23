package fr.tblf.patterns.state.distributeur.etats

import fr.tblf.patterns.state.distributeur.Distributeur

class BonbonVendu(distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("En cours de distribution.")
    }
}