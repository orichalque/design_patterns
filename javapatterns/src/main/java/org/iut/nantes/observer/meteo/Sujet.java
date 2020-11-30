package org.iut.nantes.observer.meteo;

public interface Sujet {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
