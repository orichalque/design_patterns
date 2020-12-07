package org.iut.nantes.observer.horloge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Affichage implements Observer
{
  private Date date;
  private Sujet sujet;
  private DateFormat dateFormat;

  public Affichage( Sujet s )
  {
    sujet = s;
    sujet.ajoutObs( this );
    dateFormat = new SimpleDateFormat( "HH:mm:ss" );
  }

  public void update( Date date )
  {
    this.date = date;
    System.out.println( dateFormat.format( date ) );
  }
}
