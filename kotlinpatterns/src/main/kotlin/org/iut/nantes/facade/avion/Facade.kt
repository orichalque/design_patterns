package org.iut.nantes.facade.avion

class Facade {
    fun decollage() {
        val gestionElectrique = GestionElectrique()
        val gestionEssence = GestionEssence()
        val gestionMecanique = GestionMecanique()
        gestionElectrique.batterieOn()
        gestionElectrique.chauffeCarbu()
        gestionEssence.autonomie()
        gestionEssence.mixtureRiche()
        gestionEssence.injection()
        gestionMecanique.debattement()
        gestionMecanique.voletOn()
        gestionMecanique.verriereOpen()
        gestionMecanique.demarrage()
    }

    fun atterrissage() {
        val gestionElectrique = GestionElectrique()
        val gestionEssence = GestionEssence()
        val gestionMecanique = GestionMecanique()
        gestionElectrique.batterieOff()
        gestionMecanique.freinOff()
        gestionElectrique.chauffeCarbuOff()
        gestionEssence.mixturePauvre()
    }
}