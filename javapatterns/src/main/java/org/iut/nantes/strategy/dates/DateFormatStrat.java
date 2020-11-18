package org.iut.nantes.strategy.dates;

import java.util.*;

/*
  Dans cet exercice, les Strategies concrêtes vont BEAUCOUP se 
  ressembler, d'où du code très similaire (pour ne pas dire dupliqué).
  Ceci est dû à l'exercice, pas à la conception du pattern lui-même.
 */

interface DateFormatStrat
{
  String formatStrat( Date date );
}
