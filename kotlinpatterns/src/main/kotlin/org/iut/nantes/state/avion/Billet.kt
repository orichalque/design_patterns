package org.iut.nantes.state.avion

import org.iut.nantes.state.avion.etats.*
import java.time.Instant
import java.util.*

class Billet {
    val disponible = Disponible(this)
    val reserve = Reserve(this)
    val confirme = Confirme(this)
    val consomme = Consomme(this)

    var etat: Etat = disponible

    var date: Date = Date.from(Instant.EPOCH)

    fun changerDate(date: Date) {
        this.date = date
    }

    fun modifier(date: Date) {
        etat.modifier(date)
    }

    fun payer() {
        etat.payer()
    }

    fun annuler() {
        etat.annuler()
    }

    fun partir() {
        etat.partir()
    }

    fun reserver() {
        etat.reserver()
    }

    fun changeEtatDisponible() {
        etat = disponible
    }

    fun changeEtatReserve() {
        etat = reserve
    }

    fun changeEtatConfirme() {
        etat = confirme
    }

    fun changeEtatConsomme() {
        etat = consomme
    }

}