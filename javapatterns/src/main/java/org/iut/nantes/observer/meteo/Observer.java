package org.iut.nantes.observer.meteo;

public interface Observer {
    void updateData(int temp, int humidity, int pression);
}
