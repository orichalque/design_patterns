package org.iut.nantes.state.car.etats

import org.iut.nantes.state.car.Car

class Conduite(car: Car) : Etat(car) {

    override fun action() {
        println("Vroum vroum ! ")
        car.changeEtatAttente()
    }

}