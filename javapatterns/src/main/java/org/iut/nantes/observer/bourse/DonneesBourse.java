package org.iut.nantes.observer.bourse;

import java.util.ArrayList;

public class DonneesBourse implements Sujet{

    private ArrayList<Observer> observers;
    int cac40;
    int dawjones;
    int nikkei;

    public DonneesBourse() {
        observers = new ArrayList<>();
        cac40 = 5265;
        dawjones = 6457;
        nikkei = 6844;
    }

    public int getCac40() {
        return cac40;
    }

    public void setCac40(int cac40) {
        this.cac40 = cac40;
        notifierObservers();
    }

    public int getDawjones() {
        return dawjones;
    }

    public void setDawjones(int dawjones) {
        this.dawjones = dawjones;
        notifierObservers();
    }

    public int getNikkei() {
        return nikkei;
    }

    public void setNikkei(int nikkei) {
        this.nikkei = nikkei;
        notifierObservers();
    }

    @Override
    public void notifierObservers() {
        observers.forEach(observer -> observer.actualiserDonnees(cac40, dawjones, nikkei));
    }

    @Override
    public void ajouterObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void retirerObserver(Observer obs) {
        observers.remove(obs);
    }
}
