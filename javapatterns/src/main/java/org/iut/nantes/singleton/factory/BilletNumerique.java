package org.iut.nantes.singleton.factory;

public class BilletNumerique extends Billet {
    public BilletNumerique(int numero) {
        super(numero);
    }

    @Override
    public void afficher() {
        System.out.println("Billet numérique "+numero);
    }
}
