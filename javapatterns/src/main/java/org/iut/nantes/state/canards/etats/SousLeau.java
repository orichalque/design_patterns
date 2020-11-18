package org.iut.nantes.state.canards.etats;

import org.iut.nantes.state.canards.Canard;

public class SousLeau implements Etat {
    private Canard canard;

    public SousLeau (Canard canard) {
        this.canard = canard;
    }

    @Override
    public void avancer() {
        System.out.println("Je suis sous l'eau! ");
    }

    @Override
    public void plongeon() {
        System.out.println("Je suis déjà sous l'eau!");
    }

    @Override
    public void trempette() {
        canard.changeEtatSurLeau();
    }

    @Override
    public void decollage() {

    }

    @Override
    public void palmeATerre() {

    }
}
