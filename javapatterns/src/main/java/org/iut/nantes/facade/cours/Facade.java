package org.iut.nantes.facade.cours;

public class Facade {
    private Salle salle = new Salle();
    private Multiprises multiprises = new Multiprises();
    private Ordinateur ordinateur = new Ordinateur();
    private Videoprojecteur videoprojecteur = new Videoprojecteur();
    private Retroprojecteur retroprojecteur = new Retroprojecteur();

    public void demarrerCours() {
        /**
         * Exo 1
         */
        System.out.println("\nDémarrage du cours à l'ancienne");
        salle.allumerLumiere();
        multiprises.brancherMultiprise();
        retroprojecteur.brancherVideoprojecteur(multiprises);
        retroprojecteur.allumerVidéoprojecteur();



        /**
         * Exo 2
         */
        System.out.println("\nDémarrage d'un cours moderne");
        salle.allumerLumiere();
        multiprises.brancherMultiprise();
        ordinateur.brancherOrdi(multiprises);
        videoprojecteur.brancherVideoprojecteur(multiprises);
        ordinateur.allumerOrdinateur();
        videoprojecteur.allumerVidéoprojecteur();


    }

    public void arreterCours() {
        /**
         * Exo 1
         */
        System.out.println("\nFin du cours à l'ancienne");
        retroprojecteur.éteindreVidéoprojecteur();
        retroprojecteur.débrancherVideoprojecteur(multiprises);
        multiprises.débrancherMultiprise();
        salle.eteindreLumiere();

        /**
         * Exo 2
         */
        System.out.println("\nFin d'un cours moderne");
        videoprojecteur.éteindreVidéoprojecteur();
        ordinateur.éteindreOrdinateur();
        videoprojecteur.brancherVideoprojecteur(multiprises);
        ordinateur.débrancherOrdi(multiprises);
        multiprises.débrancherMultiprise();
        salle.eteindreLumiere();
    }
}
