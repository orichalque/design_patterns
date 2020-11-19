package org.iut.nantes.factories.banque;

class Main
{
  public static void main( String args[] )
  {
    if( args.length != 2 )
    {
      System.out.println("Vous devez donner le nom du destinataire ainsi que le type de carte (visa - par défaut - , mc ou ae) en paramètres à ce programme");
      System.exit(1);
    }
    
    Carte carte;
    FactoryCarte fc;

    if( args[1].equals( "mc" ) )
      fc = new FactoryCarteMC();
    else if( args[1].equals( "ae" ) )
      fc = new FactoryCarteAE();
    else
      fc = new FactoryCarteVisa();

    carte = fc.creerCarte( args[0] );
    
    String lettre =
      " Cher/Chère M./Mme " + carte.getProprietaire()
      + ", vous trouverez ci-joint votre carte " + carte.getType()
      + " vous permettant de bénéficier d'une " + carte.getPrestation() + ".";

    System.out.println( lettre );
  }
}
