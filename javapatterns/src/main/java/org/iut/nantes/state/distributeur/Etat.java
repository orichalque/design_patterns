package org.iut.nantes.state.distributeur;

abstract class Etat
{
  protected Distributeur distributeur_;

  public Etat( Distributeur d )
  {
    distributeur_ = d;
  }
  
  // Transitions
  public void insererPiece() {}
  public void annuler() {}
  public void tournerPoignee() {}

  // Transitions automatiques
  protected void distribuerBonbon() {}
  
  // Actions
  public abstract void afficherMessage();
}

/**
   État d'attente
*/
class EtatAttente extends Etat
{
  public EtatAttente( Distributeur d )
  {
    super( d );
  }

  public void insererPiece()
  {
    distributeur_.changerEtatPiece();
  }

  public void afficherMessage()
  {
    System.out.println("Insérez une pièce svp.");
  }  
}

/**
   État "à une pièce"
*/
class EtatPiece extends Etat
{
  public EtatPiece( Distributeur d )
  {
    super( d );
  }

  public void annuler()
  {
    distributeur_.changerEtatAttente();
  }

  public void tournerPoignee()
  {
    distributeur_.changerEtatBonbonVendu();
    // À partir de maintenant, on doit s'occuper de la transition automatique
    distribuerBonbon();
  }

  protected void distribuerBonbon()
  {
    if( distributeur_.getStockBonbon() > 1 )
      distributeur_.changerEtatAttente();
    else
      distributeur_.changerEtatVide();

    distributeur_.decrementeStock();
  }

  public void afficherMessage()
  {
    System.out.println("Tournez la poignée svp, ou annulez votre commande.");
  }  
}

/**
   État bonbon vendu (ou plutôt en cours de distribution)
*/
class EtatBonbonVendu extends Etat
{
  public EtatBonbonVendu( Distributeur d )
  {
    super( d );
  }

  public void afficherMessage()
  {
    System.out.println("Distribution en cours.");
  }
}

/**
   État vide
*/
class EtatVide extends Etat
{
  public EtatVide( Distributeur d )
  {
    super( d );
  }

  public void afficherMessage()
  {
    System.out.println("Stock vide.");
  }
}
