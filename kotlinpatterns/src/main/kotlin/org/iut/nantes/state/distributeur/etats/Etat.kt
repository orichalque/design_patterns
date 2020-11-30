package org.iut.nantes.state.distributeur.etats

import org.iut.nantes.state.distributeur.Distributeur

abstract class Etat(distributeur: Distributeur) {
    abstract fun message()

    open fun insererPiece() {}
    open fun annuler() {}
    open fun tournerPoignee() {}

}