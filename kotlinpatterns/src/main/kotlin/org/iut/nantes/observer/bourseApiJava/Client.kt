package org.iut.nantes.observer.bourseApiJava

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

class AffichageCours(donnees : DonneesBourse) : PropertyChangeListener, Affichage {
    var cac40 = 0.0F
    var dawJones = 0.0F
    var nikkei = 0.0F

    init {
        donnees.ajouterObserver(this)
    }

    override fun afficher() {
        println("Cours: $cac40 $dawJones $nikkei")
    }

    override fun propertyChange(evt: PropertyChangeEvent?) {
        val newValues: Array<Float> = evt?.newValue as Array<Float>
        cac40 = newValues[0]
        dawJones = newValues[1]
        nikkei = newValues[2]
        afficher()
    }
}

class AffichageStats(donnees: DonneesBourse) : PropertyChangeListener, Affichage {
    private val cac40 = ArrayList<Float>()
    private val dawJones = ArrayList<Float>()
    private val nikkei = ArrayList<Float>()

    init {
        donnees.ajouterObserver(this)
    }

    override fun propertyChange(evt: PropertyChangeEvent?) {
        val newValues: Array<Float> = evt?.newValue as Array<Float>
        cac40.add(newValues[0])
        dawJones.add(newValues[1])
        nikkei.add(newValues[2])

        afficher()
    }

    override fun afficher() {
        println("Stats: ${cac40.average()} ${dawJones.average()} ${nikkei.average()}")
    }

}