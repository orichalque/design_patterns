package org.iut.nantes.factories.banque

abstract class Carte(var proprietaire: String) {
    abstract val type: String
    abstract val prestation: String
}

class Visa(proprietaire: String) : Carte(proprietaire) {
    override val type: String
        get() = "Visa"
    override val prestation: String
        get() = "assurance annulation avion"
}

class MasterCard(proprietaire: String) : Carte(proprietaire) {
    override val type: String
        get() = "MasterCard"
    override val prestation: String
        get() = "assistance juridique à l'étranger"
}

class AmericanExpress(proprietaire: String) : Carte(proprietaire) {
    override val type: String
        get() = "American Express"
    override val prestation: String
        get() = "réduction de location de voiture"
}