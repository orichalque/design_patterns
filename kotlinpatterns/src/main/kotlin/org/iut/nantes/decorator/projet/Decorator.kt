package org.iut.nantes.decorator.projet

abstract class Decorator(private val employe: Employe, private val bonus: Float)
    : Employe(employe.nom, employe.projet, employe.salaire * bonus) {

    override fun coder() {
        employe.coder()
    }

    override fun definirOutils() {
        employe.definirOutils()
    }

    override fun definirFonctions() {
        employe.definirFonctions()
    }

    override fun superviser() {
        employe.superviser()
    }
}