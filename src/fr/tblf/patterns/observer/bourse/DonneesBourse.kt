package fr.tblf.patterns.observer.bourse

import fr.tblf.patterns.observer.bourse.observers.Observer

class DonneesBourse : Sujet{
    private val observers: ArrayList<Observer> = ArrayList()

    var cac40 = 0.0F
    var dawJones = 0.0F
    var nikkei = 0.0F

    fun setData(c: Float, d: Float, n: Float) {
        cac40 = c
        dawJones = d
        nikkei = n

        notifierObservers()
    }

    override fun ajouterObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun retirerObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifierObservers() {
        observers.forEach { it.actualiserDonnees(cac40, dawJones, nikkei) }
    }

}