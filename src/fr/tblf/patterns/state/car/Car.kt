package fr.tblf.patterns.state.car

import fr.tblf.patterns.state.car.etats.Arret
import fr.tblf.patterns.state.car.etats.Attente
import fr.tblf.patterns.state.car.etats.Conduite
import fr.tblf.patterns.state.car.etats.Etat

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