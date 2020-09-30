package fr.tblf.patterns.decorator.nombres

abstract class Decorator(var nombre: Nombre) : Nombre() {
    abstract override fun base()
    override fun getValue(): Int {
        return nombre.getValue()
    }
}