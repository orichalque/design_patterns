package org.iut.nantes.adapter.chimie;

import java.util.ArrayList;

class DBManager
{
  private OldDB ancienneBD_;

  /**** code ajouté ****/
  private NewDB nouvelleBD_;
  private AdapterDB adapter_;
  /*********************/

  private ArrayList<OldDB> BDs;
  
  public DBManager()
  {
    Molecule eau = new Molecule( "eau", "H2O" );
    Molecule ethanol = new Molecule( "ethanol", "CH3-CH2-OH" );
    
    ancienneBD_ = new OldDB();
    ancienneBD_.oldAdd( eau );

    /**** code ajouté ****/
    nouvelleBD_ = new NewDB();
    nouvelleBD_.newAdd( ethanol );

    adapter_ = new AdapterDB( nouvelleBD_ );
    /*********************/

    BDs = new ArrayList<OldDB>();
    BDs.add( ancienneBD_ );

    /**** code ajouté ****/
    BDs.add( adapter_ );
    /*********************/
  }

  public void printMolecule( String name )
  {
    boolean printSomething = false;
    
    for( OldDB bd : BDs )
      if( bd.exists( name ) )
      {
	bd.oldMolecule( name ).affiche();
	printSomething = true;
	break;
      }
    
    if( !printSomething )
      System.out.println( "Molecule inconnue." );
  }
}
