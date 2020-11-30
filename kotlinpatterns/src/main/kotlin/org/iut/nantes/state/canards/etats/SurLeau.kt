package org.iut.nantes.state.canards.etats

import org.iut.nantes.state.canards.Canard
import org.iut.nantes.state.canards.etats.Etat

class SurLeau(private val canard: Canard)  : Etat {

    override fun avancer() {
        println("Je nage")
    }
    override fun plongeon() {
        canard.changeEtatDansEau()
    }

    override fun trempette() {
        println("Je nage déjà")
    }

    override fun decollage() {
        canard.changeEtatDansAir()
    }

    override fun palmeATerre() {
        canard.changeEtatSurTerre()
    }
}