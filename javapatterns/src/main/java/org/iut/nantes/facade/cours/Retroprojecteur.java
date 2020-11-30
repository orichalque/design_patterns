package org.iut.nantes.facade.cours;

public class Retroprojecteur {
    public void brancherVideoprojecteur(Multiprises multiprises) {
        System.out.println("Retroprojecteur branché.");
    }

    public void débrancherVideoprojecteur(Multiprises multiprises) {
        System.out.println("Retroprojecteur débranché.");
    }

    public void allumerVidéoprojecteur() {
        System.out.println("Retroprojecteur allumé.");
    }

    public void éteindreVidéoprojecteur() {
        System.out.println("Retroprojecteur éteint.");
    }
}
