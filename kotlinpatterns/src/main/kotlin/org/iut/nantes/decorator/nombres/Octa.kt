package org.iut.nantes.decorator.nombres

class Octa(nombre: Nombre) : Decorator(nombre) {
    override fun base() {
        println("Octal: "+Integer.toOctalString(getValue()))
        nombre.base()
    }

}