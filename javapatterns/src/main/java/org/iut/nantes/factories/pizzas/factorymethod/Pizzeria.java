package org.iut.nantes.factories.pizzas.factorymethod;

abstract public class Pizzeria {
    abstract public Pizza commander(String type);
}

class NantesPizzeria extends Pizzeria{
    @Override
    public Pizza commander(String type) {
        if ("royale".equals(type)) {
            return new RoyaleNante();
        } else
        if ("vegetarienne".equals(type)) {
            return new VegetarienneNantes();
        } else return null;
    }
}

class NYPizzeria extends Pizzeria{
    @Override
    public Pizza commander(String type) {
        if ("royale".equals(type)) {
            return new RoyaleNY();
        } else
        if ("vegetarienne".equals(type)) {
            return new VegetarienneNY();
        } else return null;
    }
}

class TokyoPizzeria extends Pizzeria{
    @Override
    public Pizza commander(String type) {
        if ("royale".equals(type)) {
            return new RoyaleTokyo();
        } else
        if ("vegetarienne".equals(type)) {
            return new VegetarienneTokyo();
        } else return null;
    }
}
