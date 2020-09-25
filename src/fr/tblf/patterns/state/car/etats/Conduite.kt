package fr.tblf.patterns.state.car.etats

import fr.tblf.patterns.state.car.Car

class Conduite(car: Car) : Etat(car) {

    override fun action() {
        println("Vroum vroum ! ")
        car.changeEtatAttente()
    }

}