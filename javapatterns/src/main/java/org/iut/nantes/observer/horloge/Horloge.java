package org.iut.nantes.observer.horloge;

import java.util.ArrayList;
import java.util.Date;

class Horloge implements Sujet {
    protected Date date;
    protected ArrayList<Observer> obs;

    public Horloge()
    {
        date = new Date();
        obs = new ArrayList<Observer>();
    }

    public void ajoutObs( Observer o ) { obs.add( o ); }
    public void supprObs( Observer o ) { obs.remove( o ); }
    public void notifier()
    {
        for( Observer o : obs )
            o.update( date );
    }

    public void updateDate()
    {
        date = new Date();
        notifier();
    }
}
