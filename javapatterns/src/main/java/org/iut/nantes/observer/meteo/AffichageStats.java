package org.iut.nantes.observer.meteo;

import java.util.ArrayList;

public class AffichageStats implements Observer, Affichage{
    ArrayList<Integer> temps;
    ArrayList<Integer> humidities;
    ArrayList<Integer> pressions;

    public AffichageStats(Sujet sujet) {
        sujet.addObserver(this);
        temps = new ArrayList<>();
        humidities = new ArrayList<>();
        pressions = new ArrayList<>();
    }

    @Override
    public void afficher() {
        System.out.println("Temperature: " + temps.stream().mapToInt(value -> value).average().getAsDouble());
        System.out.println("Humidity: " + humidities.stream().mapToInt(value -> value).average().getAsDouble());
        System.out.println("Pression: " + pressions.stream().mapToInt(value -> value).average().getAsDouble());
    }

    @Override
    public void updateData(int temp, int humidity, int pression) {
        temps.add(temp);
        humidities.add(humidity);
        pressions.add(pression);
        afficher();
    }
}
