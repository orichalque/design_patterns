package org.iut.nantes.factories.pizzas.abstractfactory

abstract class CreerIngredients {
    abstract fun creerPate(): Pate
    abstract fun creerSauce(): Sauce
    abstract fun creerFromage(): Fromage
}

class IngredientsNantes : CreerIngredients() {
    override fun creerPate(): Pate {
        return PateFine()
    }

    override fun creerSauce(): Sauce {
        return SauceTomate()
    }

    override fun creerFromage(): Fromage {
        return Emmental()
    }
}

class IngredientsNY : CreerIngredients() {
    override fun creerPate(): Pate {
        return PateEpaisse()
    }

    override fun creerSauce(): Sauce {
        return CremeFraiche()
    }

    override fun creerFromage(): Fromage {
        return Cheddar()
    }
}