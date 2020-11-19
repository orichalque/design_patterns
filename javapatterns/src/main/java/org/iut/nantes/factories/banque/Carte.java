package org.iut.nantes.factories.banque;

abstract class Carte
{
  protected String proprietaire;

  public Carte( String proprietaire )
  {
    this.proprietaire = proprietaire;
  }

  public String getProprietaire() { return proprietaire; }
  
  public abstract String getType();
  public abstract String getPrestation();
}

class Visa extends Carte
{
  public Visa( String proprietaire )
  {
    super( proprietaire );
  }

  public String getType() { return "Visa"; }
  public String getPrestation() { return "assurance annulation avion"; }
}

class MasterCard extends Carte
{
  public MasterCard( String proprietaire )
  {
    super( proprietaire );
  }

  public String getType() { return "MasterCard"; }
  public String getPrestation() { return "assistance juridique à l'étranger"; }
}

class AmericanExpress extends Carte
{
  public AmericanExpress( String proprietaire )
  {
    super( proprietaire );
  }

  public String getType() { return "American Express"; }
  public String getPrestation() { return "réduction de location de voiture"; }
}
