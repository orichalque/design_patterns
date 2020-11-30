package org.iut.nantes.decorator.nombres;

class Octal extends Decorator
{
  public Octal( NombreAbstrait nb )
  {
    super( nb );
  }

  public void base()
  {
    System.out.println( "En base 8 : "
			+ Integer.toOctalString( noyau.getEntier() ) );
    noyau.base();
  }
}
