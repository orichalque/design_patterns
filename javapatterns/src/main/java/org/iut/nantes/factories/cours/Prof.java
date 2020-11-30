package org.iut.nantes.factories.cours;

abstract class Prof
{
  protected String nom;
  protected String domaine;
  
  public String getNom() { return nom; }
  public String getDomaine() { return domaine; }

  public Prof( String n )
  {
    nom = n;
  }
}

class ProfInfo extends Prof
{
  public ProfInfo( String n )
  {
    super( n );
    domaine = "info";
  }
}

class ProfMaths extends Prof
{
  public ProfMaths( String n )
  {
    super( n );
    domaine = "maths";
  }
}

class ProfChimie extends Prof
{
  public ProfChimie( String n )
  {
    super( n );
    domaine = "chimie";
  }
}

