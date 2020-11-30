package org.iut.nantes.factories.pizzas.abstractfactory

abstract class Pizza(protected var creerIngredients: CreerIngredients) {
    protected var pate: Pate? = null
    protected var sauce: Sauce? = null
    protected var fromage: Fromage? = null
    abstract fun preparer()
}

class PizzaRoyale(creerIngredients: CreerIngredients) : Pizza(creerIngredients) {
    override fun preparer() {
        pate = creerIngredients.creerPate()
        sauce = creerIngredients.creerSauce()
        fromage = creerIngredients.creerFromage()
    }
}