package fr.tblf.patterns.state.car.etats

import fr.tblf.patterns.state.car.Car

abstract class Etat(val car: Car) {

    open fun action() {}
    open fun bouton() {}
    open fun adresse() {}

}