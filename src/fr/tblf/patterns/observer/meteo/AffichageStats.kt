package fr.tblf.patterns.observer.meteo

class AffichageStats(data: DonneesMeteo) : Observer, Affichage(data) {

    val temps = ArrayList<Float>()
    val humidites = ArrayList<Float>()
    val pressions = ArrayList<Float>()

    init {
        data.enregistrerObserver(this)
    }

    override fun update(temp: Float, humidite: Float, pression: Float) {
        temps.add(temp)
        humidites.add(humidite)
        pressions.add(pression)
        afficher()
    }

    override fun afficher() {
        println("Temperature moyenne: ${temps.average()} °C \nhumiditée moyenne: ${humidites.average()} %  \npression moyenne: ${pressions.average()} hPa")
    }
}