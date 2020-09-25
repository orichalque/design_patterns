package fr.tblf.patterns.observer.bourse

import fr.tblf.patterns.observer.bourse.observers.Observer

interface Sujet {
    fun ajouterObserver(observer: Observer)
    fun retirerObserver(observer: Observer)
    fun notifierObservers()
}