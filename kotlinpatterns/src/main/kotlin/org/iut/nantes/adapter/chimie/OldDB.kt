package org.iut.nantes.adapter.chimie

import java.util.*

internal open class OldDB {
    private val database_: HashMap<String?, Molecule>
    fun oldAdd(m: Molecule) {
        database_[m.name] = m
    }

    open fun exists(name: String?): Boolean {
        return database_.containsKey(name)
    }

    open fun oldMolecule(name: String?): Molecule? {
        return database_[name]
    }

    init {
        database_ = HashMap()
    }
}