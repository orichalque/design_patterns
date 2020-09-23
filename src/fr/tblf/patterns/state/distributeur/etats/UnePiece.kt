package fr.tblf.patterns.state.distributeur.etats

import fr.tblf.patterns.state.distributeur.Distributeur

class UnePiece(val distributeur: Distributeur): Etat(distributeur) {

    override fun message() {
        println("J'ai une piece.")
    }

    override fun annuler() {
        println("Annulation.")
        distributeur.toEtatAttente()
    }

    override fun tournerPoignee() {
        println("Distribution de bonbon.")
        distributeur.toEtatBonbonVendu()
        distribuerBonbon();
    }

    fun distribuerBonbon() {
        if (distributeur.bonbons > 1) {
            distributeur.toEtatAttente()
        } else {
            distributeur.toEtatVide()
        }

        distributeur.bonbons --

    }
}