package org.iut.nantes.observer.bourse

import org.iut.nantes.observer.bourse.observers.Observer

interface Sujet {
    fun ajouterObserver(observer: Observer)
    fun retirerObserver(observer: Observer)
    fun notifierObservers()
}