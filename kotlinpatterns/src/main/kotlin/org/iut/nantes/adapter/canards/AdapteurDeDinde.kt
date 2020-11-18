package org.iut.nantes.adapter.canards

class AdapteurDeDinde(private val dinde: Dinde) : Canard {
    override fun cancaner() {
        dinde.glousser()
    }

    override fun voler() {
        dinde.voler()
    }
}