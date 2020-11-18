package org.iut.nantes.state.car.etats

import org.iut.nantes.state.car.Car

class Arret(car: Car) : Etat(car) {

    override fun action() {
        println("Voiture à l'arrêt.")
    }

    override fun bouton() {
        println("Démarrage de l'automobile")
        car.changeEtatAttente()
    }


}