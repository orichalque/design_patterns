package org.iut.nantes.strategy.canards;

import org.iut.nantes.strategy.canards.comportements.ComportementCancan;
import org.iut.nantes.strategy.canards.comportements.ComportementVol;

abstract class Canard {
    protected ComportementCancan comportementCancan;
    protected ComportementVol comportementVol;

    public void voler() {
        comportementVol.voler();
    }

    public void cancanner() {
        comportementCancan.cancanner();
    }

    public ComportementCancan getComportementCancan() {
        return comportementCancan;
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public ComportementVol getComportementVol() {
        return comportementVol;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
}
