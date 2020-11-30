package org.iut.nantes.facade.avion;

public class Avion {
    private Facade facade;

    public Avion() {
        this.facade = new Facade();
    }

    public void decollage() {
        facade.decollage();
    }

    public void atterrissage() {
        facade.atterrissage();
    }
}
