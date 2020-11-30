package org.iut.nantes.facade.cours;

public class Main {
    public static void main(String[] args) {
        Enseignant enseignant = new Enseignant(new Facade());
        enseignant.demarrerCours();
        enseignant.arreterCours();
    }
}
