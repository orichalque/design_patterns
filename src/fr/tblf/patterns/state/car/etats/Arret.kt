package fr.tblf.patterns.state.car.etats

import fr.tblf.patterns.state.car.Car

class Arret(car: Car) : Etat(car) {

    override fun action() {
        println("Voiture à l'arrêt.")
    }

    override fun bouton() {
        println("Démarrage de l'automobile")
        car.changeEtatAttente()
    }


}