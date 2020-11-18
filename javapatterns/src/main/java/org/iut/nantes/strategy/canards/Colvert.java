package org.iut.nantes.strategy.canards;

import org.iut.nantes.strategy.canards.comportements.Coincoin;
import org.iut.nantes.strategy.canards.comportements.Voler;

public class Colvert extends Canard {

    public Colvert() {
        comportementCancan = new Coincoin();
        comportementVol = new Voler();
    }
}
