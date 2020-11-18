package org.iut.nantes.facade.cours

class Ordinateur {
    fun brancherOrdi(multiprises: Multiprises?) {
        println("Ordinateur branché")
    }

    fun débrancherOrdi(multiprises: Multiprises?) {
        println("Ordinateur débranché")
    }

    fun allumerOrdinateur() {
        println("Ordinateur allumé")
    }

    fun éteindreOrdinateur() {
        println("Ordinateur éteint")
    }
}