package fr.tblf.patterns.state.distributeur

fun main() {
    val distributeur = Distributeur()

    for (i in 0..9) {
        distributeur.insererPiece()
        distributeur.tournerPoignee()
        distributeur.message()
    }
}