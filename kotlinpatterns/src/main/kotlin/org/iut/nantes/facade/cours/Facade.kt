package org.iut.nantes.facade.cours

class Facade {
    private val salle = Salle()
    private val multiprises = Multiprises()
    private val ordinateur = Ordinateur()
    private val videoprojecteur = Videoprojecteur()
    private val retroprojecteur = Retroprojecteur()
    fun demarrerCours() {
        /**
         * Exo 1
         */
        println("\nDémarrage du cours à l'ancienne")
        salle.allumerLumiere()
        multiprises.brancherMultiprise()
        retroprojecteur.brancherVideoprojecteur(multiprises)
        retroprojecteur.allumerVidéoprojecteur()
        /**
         * Exo 2
         */
        println("\nDémarrage d'un cours moderne")
        salle.allumerLumiere()
        multiprises.brancherMultiprise()
        ordinateur.brancherOrdi(multiprises)
        videoprojecteur.brancherVideoprojecteur(multiprises)
        ordinateur.allumerOrdinateur()
        videoprojecteur.allumerVidéoprojecteur()
    }

    fun arreterCours() {
        /**
         * Exo 1
         */
        println("\nFin du cours à l'ancienne")
        retroprojecteur.éteindreVidéoprojecteur()
        retroprojecteur.débrancherVideoprojecteur(multiprises)
        multiprises.débrancherMultiprise()
        salle.eteindreLumiere()
        /**
         * Exo 2
         */
        println("\nFin d'un cours moderne")
        videoprojecteur.éteindreVidéoprojecteur()
        ordinateur.éteindreOrdinateur()
        videoprojecteur.brancherVideoprojecteur(multiprises)
        ordinateur.débrancherOrdi(multiprises)
        multiprises.débrancherMultiprise()
        salle.eteindreLumiere()
    }
}