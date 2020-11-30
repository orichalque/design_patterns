package org.iut.nantes.factories.cours


fun main(args: Array<String>) {
    val fc: FactoryCours = FactoryCoursInfo()
    val creneau = EDT(fc)
    creneau.remplirEDT("Duchmol")
    creneau.afficherEDT()
    creneau.setFactory(FactoryCoursMaths())
    creneau.remplirEDT("Dubois")
    creneau.afficherEDT()
    creneau.setFactory(FactoryCoursChimie())
    creneau.remplirEDT("Dupont")
    creneau.afficherEDT()
}