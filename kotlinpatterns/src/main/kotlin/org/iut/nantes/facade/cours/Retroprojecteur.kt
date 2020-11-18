package org.iut.nantes.facade.cours

class Retroprojecteur {
    fun brancherVideoprojecteur(multiprises: Multiprises?) {
        println("Retroprojecteur branché.")
    }

    fun débrancherVideoprojecteur(multiprises: Multiprises?) {
        println("Retroprojecteur débranché.")
    }

    fun allumerVidéoprojecteur() {
        println("Retroprojecteur allumé.")
    }

    fun éteindreVidéoprojecteur() {
        println("Retroprojecteur éteint.")
    }
}