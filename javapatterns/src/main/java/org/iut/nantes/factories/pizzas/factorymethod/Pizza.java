package org.iut.nantes.factories.pizzas.factorymethod;

abstract class Pizza {
    protected String fromage;
    protected String topping;
    protected String sauce;

    public void preparer() {
        System.out.println("Je prépare ma pizza");
    }

    public void cuire() {
        System.out.println("Je cuis ma pizza");
    }

    public void couper() {
        System.out.println("Je coupe ma pizza");
    }

    public void dansLaBoite() {
        System.out.println("Je mets ma pizza dans la boite");
    }
}

class RoyaleNante extends Pizza {
    public RoyaleNante() {
        fromage = "curé nantais";
        topping = "champignon de paris";
        sauce = "tomate Française";
    }
}

class RoyaleTokyo extends Pizza {
    public RoyaleTokyo() {
        fromage = "sakura chīzu";
        topping = "kikurage";
        sauce = "tomate";
    }
}

class RoyaleNY extends Pizza {
    public RoyaleNY() {
        fromage = "chedar";
        topping = "mushrooms";
        sauce = "tomate";
    }
}

class VegetarienneNantes extends Pizza {
    public VegetarienneNantes() {
        fromage = "curé nantais";
        topping = "tofu";
        sauce = "tomate";
    }
}

class VegetarienneTokyo extends Pizza {
    public VegetarienneTokyo() {
        fromage = "osef";
        topping = "tofu";
        sauce = "cream";
    }
}

class VegetarienneNY extends Pizza {
    public VegetarienneNY() {
        fromage = "chedar";
        topping = "olives";
        sauce = "cream";
    }
}