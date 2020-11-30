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

    DateFormatter dateFormatter = new DateFormatter(new FormatIntl());
    Date date = new Date();

    System.out.println(dateFormatter.format(date));

    dateFormatter.setFormatStrat(new FormatUk());
    System.out.println(dateFormatter.format(date));

    dateFormatter.setFormatStrat(new FormatUs());
    System.out.println(dateFormatter.format(date));
  }
}
