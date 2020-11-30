package org.iut.nantes.strategy.canards.comportements;

public class NePasVoler implements ComportementVol{
    @Override
    public void voler() {
        System.out.println("Je ne peux pas voler !");
    }
}
