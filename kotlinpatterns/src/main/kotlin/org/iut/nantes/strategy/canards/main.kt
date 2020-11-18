package org.iut.nantes.strategy.canards

import org.iut.nantes.strategy.canards.comportements.NePasVoler

fun main() {
    var colvert = Colvert()
    colvert.cancaner()
    colvert.voler()

    println("PAN !")
    colvert.cptVol = NePasVoler()

    colvert.voler()

    var canardEnPlastique = CanardEnPlastique()
    canardEnPlastique.voler()
    canardEnPlastique.cancaner()

}