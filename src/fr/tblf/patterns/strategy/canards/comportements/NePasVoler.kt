package fr.tblf.patterns.strategy.canards.comportements

class NePasVoler : ComportementVol {
    override fun voler() {
        println("Je ne peux pas voler...")
    }
}