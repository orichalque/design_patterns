package org.iut.nantes.state.canards.etats;

import org.iut.nantes.state.canards.Canard;

public class DansLair implements Etat {
    private Canard canard;

    public DansLair (Canard canard) {
        this.canard = canard;
    }

    @Override
    public void avancer() {
        System.out.println("Je vole!");
    }

    @Override
    public void plongeon() {
        canard.changeEtatSousLeau();
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
