package fr.tblf.patterns.state.car.etats

import fr.tblf.patterns.state.car.Car

class Attente(car: Car) : Etat(car) {

    override fun action() {
        println("Voiture en attente d'adresse")
    }

    override fun bouton() {
        println("Extinction du moteur")
        car.changeEtatArret()
    }

    override fun adresse() {
        println("Et c'est parti !")
        car.changeEtatConduite()
        Thread.sleep(1000)
        car.conduire()
    }
}