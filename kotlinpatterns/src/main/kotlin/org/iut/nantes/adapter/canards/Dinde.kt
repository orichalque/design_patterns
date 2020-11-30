package org.iut.nantes.adapter.canards

interface Dinde {
    fun voler()
    fun glousser()
}

internal class DindeSauvage : Dinde {
    override fun voler() {
        println("Je peux voler, mais j'ai la flemme.")
    }

    override fun glousser() {
        println("Glou glou glou.")
    }
}