package org.iut.nantes.factories.cours;

abstract class Cours
{
  protected String matiere;

  public String getMatiere() { return matiere; }
}

class CoursInfo extends Cours
{
  public CoursInfo()
  {
    matiere = "info";
  }
}

class CoursMaths extends Cours
{
  public CoursMaths()
  {
    matiere = "maths";
  }
}

class CoursChimie extends Cours
{
  public CoursChimie()
  {
    matiere = "chimie";
  }
}
