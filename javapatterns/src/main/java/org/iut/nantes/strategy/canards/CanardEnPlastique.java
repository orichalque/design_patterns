package org.iut.nantes.strategy.canards;

import org.iut.nantes.strategy.canards.comportements.Couinement;
import org.iut.nantes.strategy.canards.comportements.NePasVoler;

public class CanardEnPlastique extends Canard {

    public CanardEnPlastique() {
        comportementCancan = new Couinement();
        comportementVol = new NePasVoler();
    }

}
