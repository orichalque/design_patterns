package org.iut.nantes.strategy.dates.comportements

import java.text.SimpleDateFormat
import java.util.*

class DateInter : DateStrat {
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")

    override fun format(date: Date) {
        println(dateFormat.format(date))
    }
}