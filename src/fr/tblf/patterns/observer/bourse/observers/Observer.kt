package fr.tblf.patterns.observer.bourse.observers

import fr.tblf.patterns.observer.bourse.Affichage
import fr.tblf.patterns.observer.bourse.Sujet

interface Observer {
    fun actualiserDonnees(cac40: Float, dawJones: Float, nikkei: Float)
}

class AffichageCours(val donnees : Sujet) : Observer, Affichage {
    var cac40 = 0.0F
    var dawJones = 0.0F
    var nikkei = 0.0F

    init {
        donnees.ajouterObserver(this)
    }

    override fun actualiserDonnees(cac40: Float, dawJones: Float, nikkei: Float) {
        this.cac40 = cac40
        this.dawJones = dawJones
        this.nikkei = nikkei
        afficher()
    }

    override fun afficher() {
        println("Cours: $cac40 $dawJones $nikkei")
    }
}

class AffichageStats(val donnees: Sujet) : Observer, Affichage {
    val cac40 = ArrayList<Float>()
    val dawJones = ArrayList<Float>()
    val nikkei = ArrayList<Float>()

    init {
        donnees.ajouterObserver(this)
    }

    override fun actualiserDonnees(cac40: Float, dawJones: Float, nikkei: Float) {
        this.cac40.add(cac40)
        this.dawJones.add(dawJones)
        this.nikkei.add(nikkei)
        afficher()
    }

    override fun afficher() {
        println("Stats: ${cac40.average()} ${dawJones.average()} ${nikkei.average()}")
    }

}