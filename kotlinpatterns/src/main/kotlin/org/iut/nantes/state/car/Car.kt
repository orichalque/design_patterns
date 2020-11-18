package org.iut.nantes.state.car

import org.iut.nantes.state.car.etats.Arret
import org.iut.nantes.state.car.etats.Attente
import org.iut.nantes.state.car.etats.Conduite
import org.iut.nantes.state.car.etats.Etat

class Car {
    val etatArret = Arret(this)
    val etatAttente = Attente(this)
    val etatConduite = Conduite(this)

    var etat: Etat = etatArret

    fun changeEtatArret() {
        etat = etatArret
    }

    fun changeEtatConduite() {
        etat = etatConduite
    }

    fun changeEtatAttente() {
        etat = etatAttente
    }

    fun appuyerBouton() {
        etat.bouton()
    }

    fun conduire() {
        etat.action()
    }

    fun saisirAdresse() {
        etat.adresse()
    }
}