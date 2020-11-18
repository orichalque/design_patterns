package org.iut.nantes.strategy.dates;

import java.util.*;

public class DateMain
{
  static public void main(String[] args)
  {
    /*
      ATTENTION : ce n'est pas un "vrai" Strategy dans le sens où
      DateFormatStrat ne compose pas une classe cliente, mais
      est directement utilisé dans la méthode principale.
     */

    
    DateFormatStrat dateFormat;
    Date date = new Date();

    dateFormat = new FormatUk();
    System.out.println( "Aujourd'hui en UK : " + 
			dateFormat.formatStrat( date ) );

    dateFormat = new FormatUs();
    System.out.println( "Aujourd'hui en US : " + 
			dateFormat.formatStrat( date ) );

    dateFormat = new FormatIntl();
    System.out.println( "Aujourd'hui dans le monde : " + 
			dateFormat.formatStrat( date ) );
  }
}
