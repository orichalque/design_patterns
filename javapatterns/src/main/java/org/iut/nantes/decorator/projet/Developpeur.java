package org.iut.nantes.decorator.projet;

public class Developpeur extends Decorator {
    public Developpeur(Employe employe) {
        super(employe, 1.2f);
    }

    @Override
    public void coder() {
        System.out.println("Je code sur le project "+getProject().getName());
        String description = getProject().getDescription();
        getProject().setDescription(description+" avec "+getNom()+" comme developpeur");
    }
}
