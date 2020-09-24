package fr.tblf.patterns.observer.meteo

interface Sujet {
    fun enregistrerObserver(o: Observer)
    fun supprimerObserver(o: Observer)
    fun notifierObservers()
}