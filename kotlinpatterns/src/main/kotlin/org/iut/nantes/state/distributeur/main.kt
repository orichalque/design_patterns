package org.iut.nantes.state.distributeur

fun main() {
    val distributeur = Distributeur()

    for (i in 0..9) {
        distributeur.insererPiece()
        distributeur.tournerPoignee()
        distributeur.message()
    }
}