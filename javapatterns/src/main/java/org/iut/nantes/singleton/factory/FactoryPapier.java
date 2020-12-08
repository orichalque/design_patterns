package org.iut.nantes.singleton.factory;

public class FactoryPapier extends FactorySingleton{

    @Override
    public Billet creerBillet() {
        return new BilletPapier(++currentNum);
    }

    public static FactorySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (FactorySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FactoryPapier();
                }
            }
        }
        return INSTANCE;
    }
}
