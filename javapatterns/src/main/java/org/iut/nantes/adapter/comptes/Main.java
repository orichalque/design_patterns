package org.iut.nantes.adapter.comptes;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        CompteOriginal compteOriginal = new CompteOriginal(3481485);

        ArrayList<InterfaceNouveauCompte> comptes = new ArrayList<>();
        comptes.add(new NouveauCompte("13514ds"));
        comptes.add(new NouveauCompte("1d31d54"));

        comptes.add(new Adapter("3481485"));

        comptes.forEach(InterfaceNouveauCompte::affichage);
    }
}
