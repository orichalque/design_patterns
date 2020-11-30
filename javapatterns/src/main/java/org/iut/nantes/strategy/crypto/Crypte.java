package org.iut.nantes.strategy.crypto;

import java.io.*;

// Même remarques que pour l'exercice 1.

class Crypte
{
  public static void main(String [] args) throws Exception {
    String message = "mon message";
    CryptContext cryptContext = new CryptContext(new MD5());
    System.out.println(cryptContext.encode(message));

    cryptContext.setCrypteStrategy(new SHA256());
    System.out.println(cryptContext.encode(message));

    cryptContext.setCrypteStrategy(new SHA512());
    System.out.println(cryptContext.encode(message));
  }
}
