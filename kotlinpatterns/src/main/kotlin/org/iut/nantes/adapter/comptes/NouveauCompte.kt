package org.iut.nantes.adapter.comptes

class NouveauCompte(private val num: String) : InterfaceNouveauCompte {
    override fun affichage() {
        println("Numéro de nouveau compte: $num")
    }
}