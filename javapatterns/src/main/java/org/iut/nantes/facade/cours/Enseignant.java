package org.iut.nantes.facade.cours;

public class Enseignant {
    private Facade facade;

    public Enseignant(Facade facade) {
        this.facade = facade;
    }

    public void demarrerCours() {
        facade.demarrerCours();
    }

    public void arreterCours() {
        facade.arreterCours();
    }
}
