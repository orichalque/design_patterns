package org.iut.nantes.factories.pizzas.factorymethod;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new NantesPizzeria();
        Pizza p = pizzeria.commander("royale");

        pizzeria = new NYPizzeria();
        p = pizzeria.commander("royale");
    }
}
