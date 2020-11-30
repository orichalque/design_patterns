package org.iut.nantes.adapter.comptes

import java.util.*
import java.util.function.Consumer

fun main(args: Array<String>) {

    val comptes = ArrayList<InterfaceNouveauCompte>()
    val compteOriginal = CompteOriginal(3481485) //cannot add in comptes list

    comptes.add(NouveauCompte("13514ds"))
    comptes.add(NouveauCompte("1d31d54"))
    comptes.add(Adapter("3481485"))
    comptes.forEach(InterfaceNouveauCompte::affichage)
}
