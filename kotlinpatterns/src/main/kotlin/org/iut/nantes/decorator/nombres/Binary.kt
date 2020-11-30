package org.iut.nantes.decorator.nombres

class Binary(nombre: Nombre) : Decorator(nombre) {
    override fun base() {
        println("Binary: "+Integer.toBinaryString(getValue()))
        nombre.base()
    }
}