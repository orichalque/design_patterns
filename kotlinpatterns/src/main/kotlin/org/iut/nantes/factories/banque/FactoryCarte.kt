package org.iut.nantes.factories.banque

interface FactoryCarte {
    fun creerCarte(proprietaire: String): Carte
}

class FactoryCarteVisa : FactoryCarte {
    override fun creerCarte(proprietaire: String): Carte {
        return Visa(proprietaire)
    }
}

class FactoryCarteMC : FactoryCarte {
    override fun creerCarte(proprietaire: String): Carte {
        return MasterCard(proprietaire)
    }
}

class FactoryCarteAE : FactoryCarte {
    override fun creerCarte(proprietaire: String): Carte {
        return AmericanExpress(proprietaire)
    }
}