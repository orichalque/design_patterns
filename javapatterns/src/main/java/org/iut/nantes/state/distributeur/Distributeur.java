package org.iut.nantes.state.distributeur;

class Distributeur
{
  private Etat etatAttente_;
  private Etat etatPiece_;
  private Etat etatBonbonVendu_;
  private Etat etatVide_;

  private Etat etatCourant_;

  private int stockBonbon_;
  
  public Distributeur( int stock )
  {
    etatAttente_ = new EtatAttente( this );
    etatPiece_ = new EtatPiece( this );
    etatBonbonVendu_ = new EtatBonbonVendu( this );
    etatVide_ = new EtatVide( this );

    etatCourant_ = etatAttente_;
    stockBonbon_ = stock;
  }

  // Transitions
  public void insererPiece()
  {
    etatCourant_.insererPiece();
  }
  
  public void annuler()
  {
    etatCourant_.annuler();
  }
  
  public void tournerPoignee()
  {
    etatCourant_.tournerPoignee();
  }

  // Actions
  public void afficherMessage()
  {
    etatCourant_.afficherMessage();
  }

  public void changerEtatAttente()
  {
    etatCourant_ = etatAttente_;
    afficherMessage();
  }

  public void changerEtatPiece()
  {
    etatCourant_ = etatPiece_;
    afficherMessage();
  }

  public void changerEtatBonbonVendu()
  {
    etatCourant_ = etatBonbonVendu_;
    afficherMessage();
  }

  public void changerEtatVide()
  {
    etatCourant_ = etatVide_;
    afficherMessage();
  }

  public int getStockBonbon()
  {
    return stockBonbon_;
  }

  public void decrementeStock()
  {
    --stockBonbon_;
  }
}
