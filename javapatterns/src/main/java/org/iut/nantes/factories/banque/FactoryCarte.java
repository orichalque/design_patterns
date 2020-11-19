package org.iut.nantes.factories.banque;

interface FactoryCarte
{
  Carte creerCarte( String proprietaire );
}

class FactoryCarteVisa implements FactoryCarte
{
  public Carte creerCarte( String proprietaire )
  {
    return new Visa( proprietaire );
  }
}

class FactoryCarteMC implements FactoryCarte
{
  public Carte creerCarte( String proprietaire )
  {
    return new MasterCard( proprietaire );
  }
}

class FactoryCarteAE implements FactoryCarte
{
  public Carte creerCarte( String proprietaire )
  {
    return new AmericanExpress( proprietaire );
  }
}
