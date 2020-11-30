package org.iut.nantes.state.canards;

import org.iut.nantes.state.canards.etats.*;

public class Canard {
    private Etat sousLeau = new SousLeau(this);
    private Etat dansLair = new DansLair(this);
    private Etat surLeau = new SurLeau(this);
    private Etat surTerre = new SurTerre(this);

    private Etat etatCourant = surLeau;

    public void avancer() {
        etatCourant.avancer();
    }

    public void palmeATerre() {
        etatCourant.palmeATerre();
    }

    public void trempette() {
        etatCourant.trempette();
    }

    public void plongeon() {
        etatCourant.plongeon();
    }

    public void decollage() {
        etatCourant.decollage();
    }

    public void changeEtatSurLeau() {
        etatCourant = surLeau;
    }

    public void changeEtatSousLeau() {
        etatCourant = sousLeau;
    }

    public void changeEtatSurTerre() {
        etatCourant = surTerre;
    }

    public void changeEtatDansLair() {
        etatCourant = dansLair;
    }
}
