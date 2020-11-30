package org.iut.nantes.adapter.chimie

internal class AdapterDB(private val newDB_: NewDB) : OldDB() {
    override fun exists(name: String?): Boolean {
        return newDB_.exists(name)
    }

    override fun oldMolecule(name: String?): Molecule? {
        return newDB_.newMolecule(name)
    }
}