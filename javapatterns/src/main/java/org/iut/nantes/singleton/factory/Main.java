package org.iut.nantes.singleton.factory;

public class Main {
    public static void main(String[] args) {
        FactorySingleton fs = FactoryNumerique.getInstance();
        fs.creerBillet().afficher();
        fs.creerBillet().afficher();
        fs.creerBillet().afficher();
    }
}
