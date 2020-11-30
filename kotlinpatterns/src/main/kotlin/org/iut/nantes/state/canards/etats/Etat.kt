package org.iut.nantes.state.canards.etats

interface Etat {
    fun avancer()

    fun plongeon()
    fun trempette()
    fun decollage()
    fun palmeATerre()
}