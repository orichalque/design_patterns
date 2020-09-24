package fr.tblf.patterns.observer.meteo

abstract class Affichage(val data: DonneesMeteo)   {

    abstract fun afficher()
}