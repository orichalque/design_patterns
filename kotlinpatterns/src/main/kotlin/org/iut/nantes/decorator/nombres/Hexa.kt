package org.iut.nantes.decorator.nombres

class Hexa(nombre: Nombre) : Decorator(nombre) {
    override fun base() {
        println("Hexa: "+Integer.toHexString(getValue()))
        nombre.base()
    }

}