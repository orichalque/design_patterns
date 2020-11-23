package org.iut.nantes.decorator.projet;

public class Main {
    public static void main(String[] args) {
        Project p = new Project();
        p.setName("Cyberpunk2077");
        p.setDescription("Gros jeu");
        Employe remy = new EmployeConcret("Rémy", 1180.0f, p);
        remy.coder();

        System.out.println(remy.getSalaire());
        Employe devRemy = new Developpeur(remy);
        System.out.println(devRemy.getSalaire());
        Employe chefRemy = new ChefDeProjet(devRemy);
        System.out.println(chefRemy.getSalaire());

    }
}
