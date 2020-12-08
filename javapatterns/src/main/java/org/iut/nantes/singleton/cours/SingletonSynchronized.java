package org.iut.nantes.singleton.cours;

public class SingletonSynchronized {
    static private volatile SingletonSynchronized instance_;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance()
    {
        if( instance_ == null )
            instance_ = new SingletonSynchronized();
        return instance_;
    }

    public void printHelloWorld() {
        System.out.println("Hello from Singleton thread safe");
    }

}
