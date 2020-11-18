package org.iut.nantes.facade.avion

class Avion {
    private val facade: Facade
    fun decollage() {
        facade.decollage()
    }

    fun atterrissage() {
        facade.atterrissage()
    }

    init {
        facade = Facade()
    }
}