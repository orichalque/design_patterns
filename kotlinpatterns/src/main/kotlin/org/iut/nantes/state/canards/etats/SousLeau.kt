package org.iut.nantes.state.canards.etats

import org.iut.nantes.state.canards.Canard

class SousLeau(val canard: Canard) : Etat {
    override fun avancer() {
        println("Je suis sous l'eau")
    }

    override fun plongeon() {
        println("Je suis déjà sous l'eau")
    }

    override fun trempette() {
        canard.changeEtatSurEau()
    }

    override fun decollage() { }

    override fun palmeATerre() { }
}