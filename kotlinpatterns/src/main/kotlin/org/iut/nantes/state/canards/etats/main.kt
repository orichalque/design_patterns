package org.iut.nantes.state.canards.etats

import org.iut.nantes.state.canards.Canard

fun main() {
    val canard = Canard()
    canard.avancer()

    canard.palmeATerre()
    canard.avancer()

    canard.decollage()
    canard.avancer()

    canard.palmeATerre()
    canard.avancer()

    canard.plongeon()
    canard.avancer()

    canard.trempette()
    canard.avancer()

}