package fr.tblf.patterns.state.distributeur.etats

import fr.tblf.patterns.state.distributeur.Distributeur

class Attente(val distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("en attente")
    }

    override fun insererPiece() {
        distributeur.toEtatUnePiece()
    }


}