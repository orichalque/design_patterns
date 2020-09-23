package fr.tblf.patterns.strategy.canards

import fr.tblf.patterns.strategy.canards.comportements.*

abstract class Canard(var cptVol : ComportementVol, var cptCancan: ComportementCancan) {

    fun voler() {
        cptVol.voler()
    }

    fun cancaner() {
        cptCancan.cancaner()
    }



}

class Colvert : Canard(Voler(), Coincoin())

class CanardEnPlastique : Canard(NePasVoler(), Couinement())