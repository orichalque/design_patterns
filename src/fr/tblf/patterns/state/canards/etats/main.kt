package fr.tblf.patterns.state.canards.etats

import fr.tblf.patterns.state.canards.Canard

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