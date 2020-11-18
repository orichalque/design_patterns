package org.iut.nantes.adapter.chimie


fun main(argv: Array<String>) {
    val manager = DBManager()
    manager.printMolecule("ethanol")
    manager.printMolecule("eau")
    manager.printMolecule("methanol")
}