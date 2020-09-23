package fr.tblf.patterns.strategy.dates.comportements

import java.text.DateFormat
import java.util.*

class DateUS : DateStrat{
    private val dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US)

    override fun format(date: Date) {
        println(dateFormat.format(date))
    }

}