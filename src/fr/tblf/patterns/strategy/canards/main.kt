package fr.tblf.patterns.strategy.canards

import fr.tblf.patterns.strategy.canards.comportements.NePasVoler

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