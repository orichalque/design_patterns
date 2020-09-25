package fr.tblf.patterns.state.avion

import java.time.Instant
import java.util.*

fun main() {
    val billet = Billet()

    billet.modifier(Date.from(Instant.now()))    // Ne fonctionne pas
    billet.reserver()
    billet.modifier(Date.from(Instant.now()))    // Fonctionne
    billet.payer()
    billet.modifier(Date.from(Instant.now()))    // Fonctionne
    billet.partir()
    billet.modifier(Date.from(Instant.now()))    // Ne fonctionne pas
}