package org.iut.nantes.adapter.comptes;

public class Adapter extends CompteOriginal implements InterfaceNouveauCompte {
    public Adapter(String num) {
        super(Integer.parseInt(num));
    }

    @Override
    public void affichage() {
        super.afficherOriginal();
    }
}
