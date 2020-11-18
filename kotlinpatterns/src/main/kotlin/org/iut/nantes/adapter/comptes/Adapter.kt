package org.iut.nantes.adapter.comptes

class Adapter(num: String) : CompteOriginal(num.toInt()), InterfaceNouveauCompte {
    override fun affichage() {
        super.afficherOriginal()
    }
}