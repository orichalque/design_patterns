package org.iut.nantes.strategy.crypto;

import java.io.*;

// Même remarques que pour l'exercice 1.

class Crypte
{
  public static void main(String [] args)
  {
    CrypteStrategy crypte = null;
    String mess;
    String s = "Le message caché";

    try
    {
      crypte = new MD5();
    }
    catch(Exception e)
    {
      System.out.println("Erreur MD5\n");
      e.printStackTrace();
    }

    mess = crypte.encode(s);
    System.out.println(mess);    

    try
    {
      crypte = new SHA256();
    }
    catch(Exception e)
    {
      System.out.println("Erreur SHA256\n");
      e.printStackTrace();
    }

    mess = crypte.encode(s);
    System.out.println(mess);    

    try
    {
      crypte = new SHA512();
    }
    catch(Exception e)
    {
      System.out.println("Erreur SHA512\n");
      e.printStackTrace();
    }

    mess = crypte.encode(s);
    System.out.println(mess);    
  }
}
