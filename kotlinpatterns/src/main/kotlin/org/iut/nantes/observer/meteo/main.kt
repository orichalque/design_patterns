package org.iut.nantes.observer.meteo

fun main() {
    val data = DonneesMeteo()

    AffichageConditions(data)
    AffichageStats(data)

    data.setMeasures(27F, 89F, 1024F)
    data.setMeasures(33F, 74F, 1014F)
    data.setMeasures(36F, 50F, 1008F)

}