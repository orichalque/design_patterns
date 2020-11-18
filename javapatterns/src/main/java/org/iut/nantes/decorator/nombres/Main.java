package org.iut.nantes.decorator.nombres;

class Main
{
  public static void main( String argv[] )
  {
    NombreAbstrait nb = new Entier( 42 );

    nb = new Binaire( nb );
    nb = new Hexa( nb );
    nb = new Octal( nb );

    nb.base();    
  }
}
