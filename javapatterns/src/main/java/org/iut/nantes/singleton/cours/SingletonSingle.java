package org.iut.nantes.singleton.cours;

public class SingletonSingle {
    private static SingletonSingle INSTANCE;

    private SingletonSingle() {

    }

    public static SingletonSingle getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSingle();
        }
        return INSTANCE;
    }

    public void printHelloWorld() {
        System.out.println("Hello from Singleton single threaded");
    }
}
