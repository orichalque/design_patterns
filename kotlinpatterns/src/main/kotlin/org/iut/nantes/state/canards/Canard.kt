package org.iut.nantes.state.canards

import org.iut.nantes.state.canards.etats.*

class Canard {

    private val etatSurEau: Etat = SurLeau(this)
    private val etatDansAir: Etat = DansLair(this)
    private val etatSurTerre: Etat = SurTerre(this)
    private val etatDansEau: Etat = SousLeau(this)

    var etat: Etat = etatSurEau

    fun avancer() {
        etat.avancer()
    }

    fun plongeon() {
        etat.plongeon()
    }

    fun decollage() {
        etat.decollage()
    }

    fun palmeATerre() {
        etat.palmeATerre()
    }

    fun trempette() {
        etat.trempette()
    }

    fun changeEtatSurEau() {
        etat = etatSurEau
    }

    fun changeEtatDansAir() {
        etat = etatDansAir
    }

    fun changeEtatSurTerre() {
        etat = etatSurTerre
    }

    fun changeEtatDansEau() {
        etat = etatDansEau
    }
}