package org.iut.nantes.decorator.projet;

public abstract class Employe {
    private String nom;
    private float salaire;
    private Project project;

    public Employe(String nom, float salaire, Project project) {
        this.nom = nom;
        this.salaire = salaire;
        this.project = project;
    }

    public void coder() {

    }

    public void definirOutils() {

    }

    public void definirFonctions() {

    }

    public void superviser() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
