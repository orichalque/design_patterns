package fr.tblf.patterns.observer.meteo

interface Observer {
    fun update(temp: Float, humidite: Float, pression: Float)
}