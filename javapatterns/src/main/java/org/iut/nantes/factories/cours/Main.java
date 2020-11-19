package org.iut.nantes.factories.cours;

class Main
{
  public static void main( String args[] )
  {
    FactoryCours fc = new FactoryCoursInfo();
    EDT creneau = new EDT( fc );
    creneau.remplirEDT( "Duchmol" );
    creneau.afficherEDT();

    creneau.setFactory( new FactoryCoursMaths() );
    creneau.remplirEDT( "Dubois" );
    creneau.afficherEDT();

    creneau.setFactory( new FactoryCoursChimie() );
    creneau.remplirEDT( "Dupont" );
    creneau.afficherEDT();
  }
}
