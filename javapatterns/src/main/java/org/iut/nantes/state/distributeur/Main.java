package org.iut.nantes.state.distributeur;

class Main
{
  public static void main( String[] args )
  {
    Distributeur distributeur = new Distributeur( 3 );

    System.out.println("Commande 1:");
    distributeur.insererPiece();
    distributeur.tournerPoignee();

    System.out.println("\nCommande 2:");
    distributeur.insererPiece();
    distributeur.annuler();
    distributeur.insererPiece();
    distributeur.tournerPoignee();

    System.out.println("\nCommande 3:");
    distributeur.insererPiece();
    distributeur.tournerPoignee();

    System.out.println("\nCommande 4:");
    distributeur.insererPiece();
    distributeur.tournerPoignee();
  }
}
