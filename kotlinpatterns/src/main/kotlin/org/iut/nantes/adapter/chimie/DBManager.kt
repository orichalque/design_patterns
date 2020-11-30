package org.iut.nantes.adapter.chimie

import java.util.*

internal class DBManager {
    private val ancienneBD_: OldDB

    /**** code ajouté  */
    private val nouvelleBD_: NewDB
    private val adapter_: AdapterDB

    /** */
    private val BDs: ArrayList<OldDB>

    init {
        val eau = Molecule("eau", "H2O")
        val ethanol = Molecule("ethanol", "CH3-CH2-OH")
        ancienneBD_ = OldDB()
        ancienneBD_.oldAdd(eau)
        /**** code ajouté  */
        nouvelleBD_ = NewDB()
        nouvelleBD_.newAdd(ethanol)
        adapter_ = AdapterDB(nouvelleBD_)
        /** */
        BDs = ArrayList()
        BDs.add(ancienneBD_)
        /**** code ajouté  */
        BDs.add(adapter_)
        /** */
    }

    fun printMolecule(name: String?) {
        var printSomething = false
        for (bd in BDs) if (bd.exists(name)) {
            bd.oldMolecule(name)!!.affiche()
            printSomething = true
            break
        }
        if (!printSomething) println("Molecule inconnue.")
    }


}