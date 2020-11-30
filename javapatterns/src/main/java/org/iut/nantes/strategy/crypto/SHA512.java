package org.iut.nantes.strategy.crypto;

import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.math.*;

public class SHA512 implements CrypteStrategy
{
  private MessageDigest m;

  public SHA512() throws Exception
  {
    m = MessageDigest.getInstance( "SHA-512" );
  }

  public String encode(String s)
  {
    return DatatypeConverter.printHexBinary( m.digest( s.getBytes() ) );
  }
}
