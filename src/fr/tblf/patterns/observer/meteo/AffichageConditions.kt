package fr.tblf.patterns.observer.meteo

class AffichageConditions(data: DonneesMeteo) : Observer, Affichage(data) {

    private var temp: Float = 0.0f
    private var pression: Float = 0.0f
    private var humidite: Float = 0.0f

    init {
        data.enregistrerObserver(this)
    }

    override fun update(temp: Float, humidite: Float, pression: Float) {
        this.humidite = humidite
        this.pression = pression
        this.temp = temp
        afficher()
    }

    override fun afficher() {
        println("Conditions: $temp °C, $pression hPa, $humidite %")
    }
}

