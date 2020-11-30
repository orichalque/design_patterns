package org.iut.nantes.state.canards.etats

import org.iut.nantes.state.canards.Canard

class DansLair(private val canard: Canard) : Etat {
    override fun avancer() {
        println("Je vole!")
    }

    override fun plongeon() {
        canard.changeEtatDansEau()
    }

    override fun trempette() {
        canard.changeEtatSurEau()
    }

    override fun decollage() {
        println("Je vole déjà")
    }

    override fun palmeATerre() { }
}