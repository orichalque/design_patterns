package fr.tblf.patterns.state.distributeur.etats

import fr.tblf.patterns.state.distributeur.Distributeur

abstract class Etat(distributeur: Distributeur) {
    abstract fun message()

    open fun insererPiece() {}
    open fun annuler() {}
    open fun tournerPoignee() {}

}