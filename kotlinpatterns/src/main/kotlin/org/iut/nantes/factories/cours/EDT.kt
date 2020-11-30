package org.iut.nantes.factories.cours

internal class EDT(private var fc_: FactoryCours) {
    private var cours_: Cours? = null
    private var prof_: Prof? = null
    private var salle_: Salle? = null
    fun setFactory(fc: FactoryCours) {
        fc_ = fc
    }

    fun remplirEDT(nom: String) {
        cours_ = fc_.creerCours()
        prof_ = fc_.creerProf(nom)
        salle_ = fc_.creerSalle()
    }

    fun afficherEDT() {
        println("M ou Mme ${prof_!!.nom} du département ${prof_!!.domaine}"
            + " a la ${salle_!!.type} numero ${salle_!!.numero}"
            + " pour le cours de ${cours_!!.matiere}")
    }
}