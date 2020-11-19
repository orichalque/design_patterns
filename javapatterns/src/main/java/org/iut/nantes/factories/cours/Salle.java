package org.iut.nantes.factories.cours;

abstract class Salle
{
  protected String type;
  protected int numero;

  public String getType() { return type; }
  public int getNumero() { return numero; }
}

class SalleInfo extends Salle
{
  public SalleInfo()
  {
    type = "salle info";
    numero = 42;
  }
}

class SalleMaths extends Salle
{
  public SalleMaths()
  {
    type = "salle classique";
    numero = 314;
  }
}

class SalleChimie extends Salle
{
  public SalleChimie()
  {
    type = "salle chimie";
    numero = 14;
  }
}
