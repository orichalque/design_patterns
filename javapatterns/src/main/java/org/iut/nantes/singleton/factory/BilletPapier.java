package org.iut.nantes.singleton.factory;

public class BilletPapier extends Billet {
    public BilletPapier(int numero) {
        super(numero);
    }

    @Override
    public void afficher() {
        System.out.println("Billet papier "+numero);
    }
}
