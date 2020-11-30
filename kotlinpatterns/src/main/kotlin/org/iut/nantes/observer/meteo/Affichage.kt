package org.iut.nantes.observer.meteo

abstract class Affichage(val data: DonneesMeteo)   {

    abstract fun afficher()
}