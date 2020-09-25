package fr.tblf.patterns.state.avion.etats

import fr.tblf.patterns.state.avion.Billet
import java.util.*

abstract class Etat(val billet: Billet) {
    open fun reserver() {}
    open fun annuler() {}
    open fun payer() {}
    open fun partir() {}
    open fun modifier(date: Date) {}
}

class Disponible(billet: Billet) : Etat(billet) {
    override fun reserver() {
        println("Reservation effectuée!")
        billet.changeEtatReserve()
    }
}

class Reserve(billet: Billet) : Etat(billet) {
    override fun annuler() {
        println("Billet annulé !")
        billet.changeEtatDisponible()
    }

    override fun payer() {
        println("Paiement effectué ! Le billet est maintenant commandé.")
        billet.changeEtatConfirme()
    }

    override fun modifier(date: Date) {
        println("Date mise à jour au: $date")
        billet.changerDate(date)
    }
}

class Confirme(billet: Billet) : Etat(billet) {
    override fun modifier(date: Date) {
        println("Date mise à jour : $date")
        billet.changerDate(date)
    }

    override fun partir() {
        println("Décollage !")
        billet.changeEtatConsomme()
    }
}

class Consomme(billet: Billet) : Etat(billet) {

}