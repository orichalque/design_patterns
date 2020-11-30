package org.iut.nantes.state.car.etats

import org.iut.nantes.state.car.Car

abstract class Etat(val car: Car) {

    open fun action() {}
    open fun bouton() {}
    open fun adresse() {}

}