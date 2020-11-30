package org.iut.nantes.strategy.dates

import org.iut.nantes.strategy.dates.comportements.DateInter
import org.iut.nantes.strategy.dates.comportements.DateStrat
import org.iut.nantes.strategy.dates.comportements.DateUK
import org.iut.nantes.strategy.dates.comportements.DateUS
import java.time.Instant
import java.util.*

fun main() {
    var dateStrat : DateStrat
    var date = Date.from(Instant.EPOCH)

    dateStrat = DateInter()
    dateStrat.format(date)

    dateStrat = DateUS()
    dateStrat.format(date)

    dateStrat = DateUK()
    dateStrat.format(date)
}