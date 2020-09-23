package fr.tblf.patterns.state.canards.etats

import fr.tblf.patterns.state.canards.Canard

class SurLeau(private val canard: Canard)  : Etat{

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