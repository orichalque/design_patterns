package fr.tblf.patterns.decorator.nombres

class Entier(var core: Int) : Nombre() {
    override fun base() {
        println("En base 10: $core")
    }

    override fun getValue(): Int {
        return core
    }
}