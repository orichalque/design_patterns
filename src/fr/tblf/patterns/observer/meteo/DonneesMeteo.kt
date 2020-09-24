package fr.tblf.patterns.observer.meteo

import java.util.*

class DonneesMeteo : Sujet {

    private val observers = ArrayList<Observer>()

    var temp = 0.0f
    var humidite = 0.0f
    var pression = 0.0f


    override fun enregistrerObserver(o: Observer) {
        observers.add(o)
    }

    override fun supprimerObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifierObservers() {
        observers.forEach { it.update(temp, humidite, pression) }
    }

    fun actualiserMeasures() {
        notifierObservers()
    }

    fun setMeasures(t: Float, h: Float, p: Float) {
        temp = t
        humidite = h
        pression = p
        actualiserMeasures()
    }
}