package org.iut.nantes.state.distributeur

import org.iut.nantes.state.distributeur.etats.*

class Distributeur {
    var bonbons: Int = 10

    val etatAttente = Attente(this)
    val etatVide = Vide(this)
    val etatUnePiece = UnePiece(this)
    val etatBonbonVendu = BonbonVendu(this)

    var etat: Etat = etatAttente

    fun message() {
        etat.message()
    }

    fun insererPiece() {
        etat.insererPiece()
    }

    fun tournerPoignee() {
        etat.tournerPoignee()
    }

    fun annuler() {
        etat.annuler()
    }

    fun toEtatAttente() {
        etat = etatAttente
    }

    fun toEtatUnePiece() {
        etat = etatUnePiece
    }

    fun toEtatBonbonVendu() {
        etat = etatBonbonVendu
    }

    fun toEtatVide() {
        etat = etatVide
    }
}