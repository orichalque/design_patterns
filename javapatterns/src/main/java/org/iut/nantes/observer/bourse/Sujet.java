package org.iut.nantes.observer.bourse;

public interface Sujet {
    void notifierObservers();
    void ajouterObserver(Observer obs);
    void retirerObserver(Observer obs);
}
