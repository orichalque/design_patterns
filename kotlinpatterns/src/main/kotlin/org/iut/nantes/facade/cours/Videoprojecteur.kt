package org.iut.nantes.facade.cours

class Videoprojecteur {
    fun brancherVideoprojecteur(multiprises: Multiprises?) {
        println("Vidéoprojecteur branché.")
    }

    fun débrancherVideoprojecteur(multiprises: Multiprises?) {
        println("Vidéoprojecteur débranché.")
    }

    fun relierOrdinateur(ordinateur: Ordinateur?) {
        println("Ordinateur relié.")
    }

    fun allumerVidéoprojecteur() {
        println("Vidéoprojecteur allumé.")
    }

    fun éteindreVidéoprojecteur() {
        println("Vidéoprojecteur éteint.")
    }
}