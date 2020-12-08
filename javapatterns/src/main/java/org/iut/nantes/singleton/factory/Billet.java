package org.iut.nantes.singleton.factory;

abstract class Billet {
    protected int numero;
    abstract void afficher();

    public Billet(int numero) {
        this.numero = numero;
    }
}
