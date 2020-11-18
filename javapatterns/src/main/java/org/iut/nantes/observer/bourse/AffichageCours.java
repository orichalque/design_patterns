package org.iut.nantes.observer.bourse;

public class AffichageCours implements Observer, Affichage{
    private int cac40;
    private int dawjones;
    private int nikkei;

    public AffichageCours(Sujet sujet ) {
        sujet.ajouterObserver(this);
    }

    @Override
    public void afficher() {
        System.out.println("Cac40: "+cac40+" dawJones: "+dawjones+" nikkei: "+nikkei);
    }

    @Override
    public void actualiserDonnees(int cac40, int dawJones, int nikkei) {
        this.cac40 = cac40;
        this.nikkei = nikkei;
        this.dawjones = dawJones;
        afficher();
    }
}
