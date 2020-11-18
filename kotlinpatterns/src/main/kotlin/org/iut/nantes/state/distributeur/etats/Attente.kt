package org.iut.nantes.state.distributeur.etats

import org.iut.nantes.state.distributeur.Distributeur

class Attente(val distributeur: Distributeur) : Etat(distributeur) {
    override fun message() {
        println("en attente")
    }

    override fun insererPiece() {
        distributeur.toEtatUnePiece()
    }


}