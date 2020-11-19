package org.iut.nantes.factories.cours;

abstract class FactoryCours
{
  public abstract Cours creerCours();
  public abstract Prof creerProf(String nom );
  public abstract Salle creerSalle();
}

class FactoryCoursInfo extends FactoryCours
{
  public Cours creerCours() { return new CoursInfo(); }
  public Prof creerProf(String nom ) { return new ProfInfo( nom ); }
  public Salle creerSalle() { return new SalleInfo(); }
}

class FactoryCoursMaths extends FactoryCours
{
  public Cours creerCours() { return new CoursMaths(); }
  public Prof creerProf(String nom ) { return new ProfMaths( nom ); }
  public Salle creerSalle() { return new SalleMaths(); }
}

class FactoryCoursChimie extends FactoryCours
{
  public Cours creerCours() { return new CoursChimie(); }
  public Prof creerProf(String nom ) { return new ProfChimie( nom ); }
  public Salle creerSalle() { return new SalleChimie(); }
}
