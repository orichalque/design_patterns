package org.iut.nantes.observer.meteo

interface Sujet {
    fun enregistrerObserver(o: Observer)
    fun supprimerObserver(o: Observer)
    fun notifierObservers()
}