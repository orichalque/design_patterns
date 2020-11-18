package org.iut.nantes.state.canards.etats;

import org.iut.nantes.state.canards.Canard;

public class SurLeau implements Etat{

    private Canard canard;

    public SurLeau (Canard canard) {
        this.canard = canard;
    }

    @Override
    public void avancer() {
        System.out.println("Je nage sur l'eau.");
    }

    @Override
    public void plongeon() {
        canard.changeEtatSousLeau();
    }

    @Override
    public void trempette() {

    }

    @Override
    public void decollage() {
        canard.changeEtatDansLair();
    }

    @Override
    public void palmeATerre() {
        canard.changeEtatSurTerre();
    }
}
