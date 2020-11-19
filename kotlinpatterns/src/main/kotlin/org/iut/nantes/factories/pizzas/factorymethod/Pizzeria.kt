package org.iut.nantes.factories.pizzas.factorymethod

abstract class Pizzeria {
    abstract fun commander(type: String): Pizza?
}

class NantesPizzeria : Pizzeria() {
    override fun commander(type: String): Pizza? {
        return if ("royale" == type) {
            RoyaleNante()
        } else if ("vegetarienne" == type) {
            VegetarienneNantes()
        } else null
    }
}

class NYPizzeria : Pizzeria() {
    override fun commander(type: String): Pizza? {
        return if ("royale" == type) {
            RoyaleNY()
        } else if ("vegetarienne" == type) {
            VegetarienneNY()
        } else null
    }
}

class TokyoPizzeria : Pizzeria() {
    override fun commander(type: String): Pizza? {
        return if ("royale" == type) {
            RoyaleTokyo()
        } else if ("vegetarienne" == type) {
            VegetarienneTokyo()
        } else null
    }
}