package org.iut.nantes.adapter.chimie

import java.util.*

internal class NewDB {
    private val database_: HashMap<String?, Molecule>
    fun newAdd(m: Molecule) {
        database_[m.name] = m
    }

    fun exists(name: String?): Boolean {
        return database_.containsKey(name)
    }

    fun newMolecule(name: String?): Molecule? {
        return database_[name]
    }

    init {
        database_ = HashMap()
    }
}