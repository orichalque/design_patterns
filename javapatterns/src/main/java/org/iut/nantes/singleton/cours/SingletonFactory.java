package org.iut.nantes.singleton.cours;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

class SingletonFactory {
    private volatile Singleton singleton;

    public Singleton getInstance() {
        Singleton localRef = getInstanceAcquire();
        if (localRef == null) {
            synchronized (this) {
                localRef = getInstanceAcquire();
                if (localRef == null) {
                    localRef = new Singleton();
                    setInstanceRelease(localRef);
                }
            }
        }
        return localRef;
    }

    private static final VarHandle HELPER;

    private Singleton getInstanceAcquire() {
        return (Singleton) HELPER.getAcquire(this);
    }
    private void setInstanceRelease(Singleton value) {
        HELPER.setRelease(this, value);
    }

    static {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            HELPER = lookup.findVarHandle(SingletonFactory.class, "singleton", Singleton.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

}
