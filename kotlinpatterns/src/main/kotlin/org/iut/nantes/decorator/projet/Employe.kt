package org.iut.nantes.decorator.projet

abstract class Employe(val nom: String, val projet: Projet, val salaire: Float) {
    open fun coder() {}
    open fun definirOutils() {}
    open fun definirFonctions() {}
    open fun superviser() {}

}