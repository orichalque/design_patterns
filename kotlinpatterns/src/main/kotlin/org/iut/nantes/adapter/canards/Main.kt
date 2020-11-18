package org.iut.nantes.adapter.canards


fun main(args: Array<String>) {
    val colvert: Canard = Colvert()
    val dindeSauvage: Dinde = DindeSauvage()
    Affichage.affiche(colvert)
    Affichage.affiche(AdapteurDeDinde(dindeSauvage))
}