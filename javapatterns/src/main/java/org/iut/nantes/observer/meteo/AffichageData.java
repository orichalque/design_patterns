package org.iut.nantes.observer.meteo;

public class AffichageData implements Affichage, Observer {
    protected int temp;
    protected int humidity;
    protected int pression;

    public AffichageData(Sujet sujet) {
        sujet.addObserver(this);
    }

    @Override
    public void updateData(int temp, int humidity, int pression) {
        this.temp = temp;
        this.humidity = humidity;
        this.pression = pression;
        afficher();
    }

    @Override
    public void afficher() {
        System.out.println("Temperature: "+temp);
        System.out.println("Humidity: "+humidity);
        System.out.println("Pression: "+pression);
    }
}
