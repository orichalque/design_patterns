package org.iut.nantes.adapter.canards;

public class Main {
    public static void main(String... args) {
        Canard colvert = new Colvert();
        Dinde dindeSauvage = new DindeSauvage();

        Affichage.affiche(colvert);
        Affichage.affiche(new AdapteurDeDinde(dindeSauvage));
    }
}
