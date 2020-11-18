package org.iut.nantes.observer.bourse;

public class Main {
    public static void main(String... args) {
        DonneesBourse donneesBourse = new DonneesBourse();
        Affichage affichage = new AffichageCours(donneesBourse);

        donneesBourse.setCac40(1272);
        donneesBourse.setNikkei(51581);

    }
}
