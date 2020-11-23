package org.iut.nantes.observer.meteo;

public class Main {
    public static void main(String... args) {
        StationMeteo stationMeteo = new StationMeteo();

        AffichageData data = new AffichageData(stationMeteo);
        AffichageStats stats = new AffichageStats(stationMeteo);

        stationMeteo.updateData(23, 78, 1012);
        stationMeteo.updateData(26, 72, 1021);
    }
}
