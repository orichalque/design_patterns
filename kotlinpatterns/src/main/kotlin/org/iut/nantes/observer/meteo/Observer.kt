package org.iut.nantes.observer.meteo

interface Observer {
    fun update(temp: Float, humidite: Float, pression: Float)
}