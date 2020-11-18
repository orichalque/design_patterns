package org.iut.nantes.state.canards.etats

import org.iut.nantes.state.canards.Canard

class SurTerre(private val canard: Canard) : Etat {
    override fun avancer() {
        println("Je marche sur le sol")
    }

    override fun plongeon(){ }

    override fun trempette() {
        canard.changeEtatSurEau()
    }

    override fun decollage() {
        canard.changeEtatDansAir()
    }

    override fun palmeATerre() {
        println("Déjà sur terre!")
    }
}