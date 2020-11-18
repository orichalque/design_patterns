package org.iut.nantes.facade.avion;

public class Facade {
    public void decollage() {
        GestionElectrique gestionElectrique = new GestionElectrique();
        GestionEssence gestionEssence = new GestionEssence();
        GestionMecanique gestionMecanique = new GestionMecanique();

        gestionElectrique.batterieOn();
        gestionElectrique.chauffeCarbu();

        gestionEssence.autonomie();
        gestionEssence.mixtureRiche();
        gestionEssence.injection();

        gestionMecanique.debattement();
        gestionMecanique.voletOn();
        gestionMecanique.verriereOpen();

        gestionMecanique.demarrage();
    }

    public void atterrissage() {
        GestionElectrique gestionElectrique = new GestionElectrique();
        GestionEssence gestionEssence = new GestionEssence();
        GestionMecanique gestionMecanique = new GestionMecanique();

        gestionElectrique.batterieOff();
        gestionMecanique.freinOff();
        gestionElectrique.chauffeCarbuOff();
        gestionEssence.mixturePauvre();
    }
}
