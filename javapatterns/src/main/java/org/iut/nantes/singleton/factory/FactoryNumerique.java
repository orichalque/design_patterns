package org.iut.nantes.singleton.factory;

public class FactoryNumerique extends FactorySingleton{
    @Override
    public Billet creerBillet() {
        return new BilletNumerique(++currentNum);
    }

    public static FactorySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (FactorySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FactoryNumerique();
                }
            }
        }
        return INSTANCE;
    }
}
