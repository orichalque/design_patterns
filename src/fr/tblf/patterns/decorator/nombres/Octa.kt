package fr.tblf.patterns.decorator.nombres

class Octa(nombre: Nombre) : Decorator(nombre) {
    override fun base() {
        println("Octal: "+Integer.toOctalString(getValue()))
        nombre.base()
    }

}