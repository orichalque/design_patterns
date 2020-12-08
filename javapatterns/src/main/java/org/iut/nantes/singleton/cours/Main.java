package org.iut.nantes.singleton.cours;

public class Main {
    public static void main(String[] args) {
        SingletonSingle.getInstance().printHelloWorld();

        SingletonSynchronized.getInstance().printHelloWorld();

        new SingletonFactory().getInstance().printHelloWorld();
    }
}
