package org.iut.nantes.strategy.canards;

import org.iut.nantes.strategy.canards.comportements.NePasVoler;

public class Main {
    public static void main(String ... args) {
        Canard colvert = new Colvert();
        colvert.voler();
        colvert.cancanner();

        // PAN !
        colvert.setComportementVol(new NePasVoler());

        colvert.voler();

    }
}
