package org.iut.nantes.factories.pizzas.abstractfactory;

abstract class Pizza {
    protected CreerIngredients creerIngredients;

    protected Pate pate;
    protected Sauce sauce;
    protected Fromage fromage;

    public Pizza(CreerIngredients creerIngredients) {
        this.creerIngredients = creerIngredients;
    }

    abstract void preparer();
}

class PizzaRoyale extends Pizza {

    public PizzaRoyale(CreerIngredients creerIngredients) {
        super(creerIngredients);
    }

    @Override
    void preparer() {
        pate = creerIngredients.creerPate();
        sauce = creerIngredients.creerSauce();
        fromage = creerIngredients.creerFromage();
    }

}