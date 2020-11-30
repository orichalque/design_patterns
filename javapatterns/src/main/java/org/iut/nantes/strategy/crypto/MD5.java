package org.iut.nantes.strategy.crypto;

import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.math.*;

public class MD5 implements CrypteStrategy
{
  private MessageDigest m;

  public MD5() throws Exception
  {
    m = MessageDigest.getInstance( "MD5" );
  }

  public String encode(String s)
  {
    // m.update( s.getBytes() );
    // return new String( m.digest() );
    return DatatypeConverter.printHexBinary( m.digest( s.getBytes() ) );
  }
}
