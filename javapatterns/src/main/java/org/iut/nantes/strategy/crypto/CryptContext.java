package org.iut.nantes.strategy.crypto;

public class CryptContext {
    private CrypteStrategy crypteStrategy;

    public CryptContext(CrypteStrategy crypteStrategy) {
        this.crypteStrategy = crypteStrategy;
    }

    public String encode(String s) {
        return crypteStrategy.encode(s);
    }

    public CrypteStrategy getCrypteStrategy() {
        return crypteStrategy;
    }

    public void setCrypteStrategy(CrypteStrategy crypteStrategy) {
        this.crypteStrategy = crypteStrategy;
    }
}
