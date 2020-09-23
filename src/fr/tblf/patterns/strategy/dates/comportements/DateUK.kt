package fr.tblf.patterns.strategy.dates.comportements

import java.text.DateFormat
import java.util.*

class DateUK : DateStrat {
    private val dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK)

    override fun format(date: Date) {
        println(dateFormat.format(date))
    }
}