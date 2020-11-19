package org.iut.nantes.factories.pizzas.factorymethod

fun main(args: Array<String>) {
    var pizzeria: Pizzeria = NantesPizzeria()
    var p = pizzeria.commander("royale")
    pizzeria = NYPizzeria()
    p = pizzeria.commander("royale")
}