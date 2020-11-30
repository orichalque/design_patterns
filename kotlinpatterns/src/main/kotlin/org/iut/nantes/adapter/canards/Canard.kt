package org.iut.nantes.adapter.canards

interface Canard {
    fun cancaner()
    fun voler()
}

internal class Colvert : Canard {
    override fun cancaner() {
        println("Coin coin.")
    }

    override fun voler() {
        println("Je vole.")
    }
}