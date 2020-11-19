package org.iut.nantes.factories.cours;

class EDT
{
  private FactoryCours fc_;

  private Cours cours_;
  private Prof prof_;
  private Salle salle_;

  public EDT( FactoryCours fc )
  {
    fc_ = fc;
  }

  public void setFactory( FactoryCours fc )
  {
    fc_ = fc;
  }

  public void remplirEDT( String nom )
  {
    cours_ = fc_.creerCours();
    prof_ = fc_.creerProf( nom );
    salle_ = fc_.creerSalle();
  }

  public void afficherEDT()
  {
    if( prof_ != null )
      System.out.println( "M ou Mme " + prof_.getNom() + " du département " + prof_.getDomaine()
			  + " a la " + salle_.getType() + " numero " + salle_.getNumero()
			  + " pour le cours de " + cours_.getMatiere() );
  }
  
}
