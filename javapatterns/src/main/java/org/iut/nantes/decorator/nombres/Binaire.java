package org.iut.nantes.decorator.nombres;

class Binaire extends Decorator
{
  public Binaire( NombreAbstrait nb )
  {
    super( nb );
  }

  public void base()
  {
    System.out.println( "En base 2 : "
			+ Integer.toBinaryString( noyau.getEntier() ) );
    noyau.base();
  }
}
