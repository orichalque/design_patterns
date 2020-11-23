package org.iut.nantes.decorator.projet;

public abstract class Decorator extends Employe{
    private Employe composant;
    private float bonus;

    public Decorator(Employe employe, float bonus) {
        super(employe.getNom(), employe.getSalaire(), employe.getProject());
        this.composant = employe;
        this.bonus = bonus;
    }

    @Override
    public float getSalaire() {
        return bonus * composant.getSalaire();
    }

    @Override
    public void coder() {
        composant.coder();
    }

    @Override
    public void definirOutils() {
        composant.definirOutils();
    }

    @Override
    public void definirFonctions() {
        composant.definirFonctions();
    }

    @Override
    public void superviser() {
        composant.superviser();
    }
}
