package org.iut.nantes.decorator.nombres;

abstract class Decorator extends NombreAbstrait
{
  protected NombreAbstrait noyau;

  public Decorator( NombreAbstrait nb )
  {
    noyau = nb;
  }

  public int getEntier()
  {
    return noyau.getEntier();
  }
}
