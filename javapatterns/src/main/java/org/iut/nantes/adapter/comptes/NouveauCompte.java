package org.iut.nantes.adapter.comptes;

public class NouveauCompte implements InterfaceNouveauCompte{
    private String num;

    public NouveauCompte(String num) {
        this.num = num;
    }

    @Override
    public void affichage() {
        System.out.println("Numéro de nouveau compte: "+num);
    }
}
