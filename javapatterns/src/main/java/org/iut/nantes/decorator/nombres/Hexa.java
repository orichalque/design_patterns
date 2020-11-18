package org.iut.nantes.decorator.nombres;

class Hexa extends Decorator
{
  public Hexa( NombreAbstrait nb )
  {
    super( nb );
  }

  public void base()
  {
    System.out.println( "En base 16 : "
			+ Integer.toHexString( noyau.getEntier() ) );
    noyau.base();
  }
}
