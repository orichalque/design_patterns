package org.iut.nantes.state.canards;

public class Main {
    public static void main(String... args) {
        Canard canard = new Canard();
        canard.avancer();

        canard.palmeATerre();
        canard.avancer();

        canard.decollage();
        canard.avancer();

        canard.palmeATerre();
        canard.avancer();

        canard.plongeon();
        canard.avancer();

        canard.trempette();
        canard.avancer();

    }
}
