package org.iut.nantes.adapter.canards;

public interface Canard {
    void cancaner();
    void voler();
}

class Colvert implements Canard {

    @Override
    public void cancaner() {
        System.out.println("Coin coin.");
    }

    @Override
    public void voler() {
        System.out.println("Je vole.");
    }
}
