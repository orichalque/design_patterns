package org.iut.nantes.decorator.concession

abstract class Serie {
    abstract var cout: Float
    abstract var carburant: Carburant

    open fun cout(): Float {
        return cout + if (carburant == Carburant.GASOIL) 500f else 0f
    }
}

enum class Carburant {
    ESSENCE,
    GASOIL
}

class Modele325 : Serie() {
    override var carburant = Carburant.ESSENCE
    override var cout = 32500f
}

class Modele330: Serie() {
    override var carburant = Carburant.ESSENCE
    override var cout = 33000f
}

class Modele535: Serie() {
    override var carburant = Carburant.ESSENCE
    override var cout = 53500f
}