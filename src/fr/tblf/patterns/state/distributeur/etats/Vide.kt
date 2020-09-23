package fr.tblf.patterns.state.distributeur.etats

import fr.tblf.patterns.state.distributeur.Distributeur

class Vide(distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("Vide.")
    }
}