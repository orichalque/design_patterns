package org.iut.nantes.factories.pizzas.factorymethod

abstract class Pizza {
    protected var fromage: String? = null
    protected var topping: String? = null
    protected var sauce: String? = null
    fun preparer() {
        println("Je prépare ma pizza")
    }

    fun cuire() {
        println("Je cuis ma pizza")
    }

    fun couper() {
        println("Je coupe ma pizza")
    }

    fun dansLaBoite() {
        println("Je mets ma pizza dans la boite")
    }
}

class RoyaleNante : Pizza() {
    init {
        fromage = "curé nantais"
        topping = "champignon de paris"
        sauce = "tomate Française"
    }
}

class RoyaleTokyo : Pizza() {
    init {
        fromage = "sakura chīzu"
        topping = "kikurage"
        sauce = "tomate"
    }
}

class RoyaleNY : Pizza() {
    init {
        fromage = "chedar"
        topping = "mushrooms"
        sauce = "tomate"
    }
}

class VegetarienneNantes : Pizza() {
    init {
        fromage = "curé nantais"
        topping = "tofu"
        sauce = "tomate"
    }
}

class VegetarienneTokyo : Pizza() {
    init {
        fromage = "osef"
        topping = "tofu"
        sauce = "cream"
    }
}

class VegetarienneNY : Pizza() {
    init {
        fromage = "chedar"
        topping = "olives"
        sauce = "cream"
    }
}