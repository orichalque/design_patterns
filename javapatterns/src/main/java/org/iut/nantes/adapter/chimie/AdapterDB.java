package org.iut.nantes.adapter.chimie;

class AdapterDB extends OldDB
{
  private NewDB newDB_;

  public AdapterDB( NewDB newDB )
  {
    newDB_ = newDB;
  }

  public boolean exists( String name ) { return newDB_.exists( name ); }
  public Molecule oldMolecule( String name ) { return newDB_.newMolecule( name ); }
}
