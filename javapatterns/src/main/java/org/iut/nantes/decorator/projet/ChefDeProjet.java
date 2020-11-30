package org.iut.nantes.decorator.projet;

public class ChefDeProjet extends Decorator {
    public ChefDeProjet(Employe employe) {
        super(employe, 2.0f);
    }

    public void superviser() {
        System.out.println("Je supervise sur le project "+getProject().getName());
        String description = getProject().getDescription();
        getProject().setDescription(description+" avec "+getNom()+" comme chef de projet.");
    }
}
