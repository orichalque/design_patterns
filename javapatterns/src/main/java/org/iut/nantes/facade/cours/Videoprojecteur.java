package org.iut.nantes.facade.cours;

public class Videoprojecteur {
    public void brancherVideoprojecteur(Multiprises multiprises) {
        System.out.println("Vidéoprojecteur branché.");
    }

    public void débrancherVideoprojecteur(Multiprises multiprises) {
        System.out.println("Vidéoprojecteur débranché.");
    }

    public void relierOrdinateur(Ordinateur ordinateur) {
        System.out.println("Ordinateur relié.");
    }

    public void allumerVidéoprojecteur() {
        System.out.println("Vidéoprojecteur allumé.");
    }

    public void éteindreVidéoprojecteur() {
        System.out.println("Vidéoprojecteur éteint.");
    }
}
