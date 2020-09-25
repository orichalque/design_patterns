package fr.tblf.patterns.observer.bourse

import fr.tblf.patterns.observer.bourse.observers.AffichageCours
import fr.tblf.patterns.observer.bourse.observers.AffichageStats

fun main() {
    val bourse = DonneesBourse()
    AffichageCours(bourse)
    AffichageStats(bourse)

    bourse.setData(50f, 20f, 30f)
    bourse.setData(100f, 10f, 300f)
    bourse.setData(75f, 0f, 50f)

}