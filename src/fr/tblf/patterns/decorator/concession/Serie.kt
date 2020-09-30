package fr.tblf.patterns.decorator.concession

abstract class Serie {
    abstract fun cout() : Float
}

enum class Carburant {
    ESSENCE,
    GASOIL
}

class Modele325 : Serie() {
    var carburant = Carburant.ESSENCE

    override fun cout(): Float {
        return 32500f + if (carburant == Carburant.GASOIL) 500f else 0f
    }
}

class Modele330: Serie() {
    var carburant = Carburant.ESSENCE

    override fun cout(): Float {
        return 33000f + if (carburant == Carburant.GASOIL) 600f else 0f
    }
}

class Modele535: Serie() {
    var carburant = Carburant.ESSENCE

    override fun cout(): Float {
        return 53500f + if (carburant == Carburant.GASOIL) 800f else 0f
    }
}