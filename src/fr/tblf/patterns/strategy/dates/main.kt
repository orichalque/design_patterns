package fr.tblf.patterns.strategy.dates

import fr.tblf.patterns.strategy.dates.comportements.DateInter
import fr.tblf.patterns.strategy.dates.comportements.DateStrat
import fr.tblf.patterns.strategy.dates.comportements.DateUK
import fr.tblf.patterns.strategy.dates.comportements.DateUS
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