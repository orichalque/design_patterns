package org.iut.nantes.decorator.nombres;

class Entier extends NombreAbstrait
{
  private int entier;
  
  public Entier() { }

  public Entier( int entier )
  {
    this.entier = entier;
  }

  public int getEntier()
  {
    return entier;
  }
  
  public void base()
  {
    System.out.println( "En base 10 : " + entier );
  }
}
