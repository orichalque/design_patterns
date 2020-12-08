package org.iut.nantes.singleton.factory;

public abstract class FactorySingleton {

    protected volatile static FactorySingleton INSTANCE;
    protected int currentNum;

    protected FactorySingleton() { currentNum = 0;}

    abstract Billet creerBillet();
}
