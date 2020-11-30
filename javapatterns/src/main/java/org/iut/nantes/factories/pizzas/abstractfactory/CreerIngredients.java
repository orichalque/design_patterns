package org.iut.nantes.factories.pizzas.abstractfactory;

abstract class CreerIngredients {
    abstract Pate creerPate();
    abstract Sauce creerSauce();
    abstract Fromage creerFromage();
}

class IngredientsNantes extends CreerIngredients {
    @Override
    public Pate creerPate() {
        return new PateFine();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceTomate();
    }

    @Override
    Fromage creerFromage() {
        return new Emmental();
    }
}

class IngredientsNY extends CreerIngredients {

    @Override
    public Pate creerPate() {
        return new PateEpaisse();
    }

    @Override
    public Sauce creerSauce() {
        return new CremeFraiche();
    }

    @Override
    Fromage creerFromage() {
        return new Cheddar();
    }
}