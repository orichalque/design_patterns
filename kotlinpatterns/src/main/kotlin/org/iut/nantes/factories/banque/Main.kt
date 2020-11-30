package org.iut.nantes.factories.banque

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Vous devez donner le nom du destinataire ainsi que le type de carte (visa - par défaut - , mc ou ae) en paramètres à ce programme")
        exitProcess(1)
    }
    val carte: Carte

    val fc: FactoryCarte = when(args[1]) {
        "mc" -> FactoryCarteMC()
        "ae" -> FactoryCarteAE()
        else -> FactoryCarteVisa()
    }

    carte = fc.creerCarte(args[0])

    val lettre = (" Cher/Chère M./Mme ${carte.proprietaire}" +
            ", vous trouverez ci-joint votre carte ${carte.type}" +
            ", vous permettant de bénéficier d'une ${carte.prestation}.")

    println(lettre)
}