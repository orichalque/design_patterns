package org.iut.nantes.facade.cours;

public class Ordinateur {
    public void brancherOrdi(Multiprises multiprises) {
        System.out.println("Ordinateur branché");
    }

    public void débrancherOrdi(Multiprises multiprises) {
        System.out.println("Ordinateur débranché");
    }

    public void allumerOrdinateur() {
        System.out.println("Ordinateur allumé");
    }

    public void éteindreOrdinateur() {
        System.out.println("Ordinateur éteint");
    }
}
