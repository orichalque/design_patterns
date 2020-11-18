package org.iut.nantes.observer.meteo;

import java.util.ArrayList;

public class StationMeteo implements Sujet {

    int temp;
    int humidity;
    int pression;

    private ArrayList<Observer> observers;

    public StationMeteo() {
        observers = new ArrayList<>();
        temp = 22;
        humidity = 76;
        pression = 978;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.updateData(temp, humidity, pression));
    }

    public void updateData(int t, int h, int p) {
        temp = t;
        humidity = h;
        pression = p;
        notifyObservers();
    }
}
