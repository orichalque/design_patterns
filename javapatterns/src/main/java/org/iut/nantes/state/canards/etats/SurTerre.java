package org.iut.nantes.state.canards.etats;

import org.iut.nantes.state.canards.Canard;

public class SurTerre implements Etat {
    private Canard canard;

    public SurTerre (Canard canard) {
        this.canard = canard;
    }

    @Override
    public void avancer() {
        System.out.println("Je marche.");
    }

    @Override
    public void plongeon() {

    }

    @Override
    public void trempette() {
        canard.changeEtatSurLeau();
    }

    @Override
    public void decollage() {
        canard.changeEtatDansLair();
    }

    @Override
    public void palmeATerre() {

    }
}
